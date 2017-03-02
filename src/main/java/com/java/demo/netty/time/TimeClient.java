package com.java.demo.netty.time;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * Created by boge on 17/1/23.
 */
public class TimeClient {

    public static void main(String[] args) {
        int port = 8080;
        if(args != null && args.length>0){
            try{
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException ef) {
                //采用默认端口
            }
            try {
                new TimeClient().connect("127.0.0.1", port);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void connect(String host, int port) {
        // 配置客户端nio线程组
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(group).channel(NioSocketChannel.class)
                    .option(ChannelOption.TCP_NODELAY, true)
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            socketChannel.pipeline().addLast(new TimeClientHandler());
                        }
                    });

            // 发起异步操作链接
            try {
                ChannelFuture f = b.connect(host, port).sync();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } finally {
            group.shutdownGracefully();
        }
    }
}

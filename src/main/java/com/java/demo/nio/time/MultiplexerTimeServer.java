package com.java.demo.nio.time;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by boge on 17/1/20.
 */
public class MultiplexerTimeServer implements Runnable {

    // 复用器
    private Selector selector;
    private ServerSocketChannel serverSocketChannel;
    private volatile boolean stop;

    public MultiplexerTimeServer(int port){
        try {
            selector = Selector.open();
            serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.configureBlocking(false);
            // backlog
            serverSocketChannel.socket().bind(new InetSocketAddress(port), 1024);
            //将ServerSocketChannel注册到Selector，并监听SelectionKey.OP_ACCEPT操作位
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("the time server is started: port is "+port);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void stop(){
        this.stop = true;
    }

    @Override
    public void run() {
        while (! stop){
            try {
                //休眠时间为1秒
                selector.select(1000);
                //当有处于就绪状态到channel，selector将返回改channel的SelectionKey集合
                Set<SelectionKey> selectionKey = selector.selectedKeys();
                Iterator<SelectionKey> it = selectionKey.iterator();
                SelectionKey key = null;
                while (it.hasNext()){
                    key = it.next();
                    it.remove();

                    try {
                        handleInput(key);
                    } catch (Exception ef){
                        if(key != null){
                            key.cancel();
                            if(key.channel() != null){
                                key.channel().close();
                            }
                        }
                    }
                }

            } catch (Throwable e) {
                e.printStackTrace();
            }
        }

        //多路复用器关闭后，所有注册在上面的channel和pipe等资源都会被自动注册并关闭，所以不需要重复释放资源。
        if(selector != null){
            try {
                selector.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void handleInput(SelectionKey key) throws IOException {
        if(key.isValid()){
            //接收到新的请求
            if(key.isAcceptable()){
                ServerSocketChannel ssc = (ServerSocketChannel) key.channel();
                SocketChannel sc = ssc.accept();
                sc.configureBlocking(false);
                sc.register(selector, SelectionKey.OP_ACCEPT);
            }

            if(key.isReadable()){
                SocketChannel sc = (SocketChannel) key.channel();
                ByteBuffer readBuffer = ByteBuffer.allocate(1024);
                int readBytes = sc.read(readBuffer);
                if(readBytes > 0){
                    readBuffer.flip();
                    byte[] bytes = new byte[readBuffer.remaining()];
                    readBuffer.get();
                    String body = new String(bytes, "utf-8");
                    System.out.println("the server receive order: "+body);

                    String currentTime = "QUERY TIME ORDER".equalsIgnoreCase(body) ?
                            new java.util.Date(System.currentTimeMillis()).toString() : "BAD ORDER";

                    doWrite(sc, currentTime);
                } else if(readBytes < 0){
                    //端链路关闭
                    key.channel();
                    sc.close();
                } else {
                    //忽略
                }
            }
        }
    }

    private void doWrite(SocketChannel sc, String response) throws IOException {
        if(response != null && response.trim().length() > 0){
            byte[] bytes = response.getBytes();
            ByteBuffer writeBuffer = ByteBuffer.allocate(bytes.length);
            writeBuffer.put(bytes);
            writeBuffer.flip();
            sc.write(writeBuffer);
        }
    }
}
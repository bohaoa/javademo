package com.java.demo.nio.base;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;

/**
 * channel分类：
     FileChannel 从文件中读写数据。
     DatagramChannel 能通过UDP读写网络中的数据。
     SocketChannel 能通过TCP读写网络中的数据。
     ServerSocketChannel可以监听新进来的TCP连接，像Web服务器那样。对每一个新进来的连接都会创建一个SocketChannel。
 *
 * buffer用法步骤：
     写入数据到Buffer
     调用flip()方法
     从Buffer中读取数据
     调用clear()方法或者compact()方法
 * Created by boge on 17/1/23.
 */
public class FileChannelTest {

    public static void main(String[] args) {
        try {
            //RandomAccessFile aFile = new RandomAccessFile("/Users/boge/Documents/delete.sql", "rw");
            //FileChannel fileChannel = aFile.getChannel();
            FileChannel fileChannel = FileChannel.open(Paths.get("/Users/boge/Documents/delete.sql"));

            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            //byteBuffer.put(12); //直接写入buffer  http://ifeve.com/buffers/

            //吧channel的数据读到buffer中
            int readBytes = fileChannel.read(byteBuffer);
            while (readBytes != -1) {
                System.out.println("read:"+readBytes);
                byteBuffer.flip();

                while (byteBuffer.hasRemaining()){
                    System.out.println(byteBuffer.get());
                }

                byteBuffer.clear();
                readBytes = fileChannel.read(byteBuffer);
            }
            //aFile.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

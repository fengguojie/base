package com.chinadovey.power.webapps.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelUtil {
	static private final byte message[] = { 83, 111, 109, 101, 32,  
	        98, 121, 116, 101, 115, 46 };
	
	public static void main(String[] args) throws IOException {
		//读数据  流-》通道-》缓冲区
		/*FileInputStream fin = new FileInputStream("c:\\test.txt");  
        FileChannel fc = fin.getChannel();  
        ByteBuffer buffer = ByteBuffer.allocate(1024);  
        fc.read(buffer);  
        buffer.flip();  
        while (buffer.remaining()>0) {  
            byte b = buffer.get();  
            System.out.print(((char)b));  
        }  
        fin.close();*/
        
        //写数据 流-》通道-》缓冲区-》写到文件
        FileOutputStream fout = new FileOutputStream( "d:\\test.txt" );  
        FileChannel fc2 = fout.getChannel();  
        ByteBuffer buffer2 = ByteBuffer.allocate(1024);  
        for (int i=0; i<message.length; ++i) {  
            buffer2.put(message[i]);  
        }  
        buffer2.flip();  
        fc2.write(buffer2);
        fout.close(); 
	}

}

package com.chinadovey.power.webapps.io;

import java.nio.IntBuffer;

/**
 * nio Buffer练习
 * @author feng
 */
public class BufferUtil {
	private static int capacity = 10;//缓冲区的容量
	
	public static void main(String[] args) {
		IntBuffer buffer = IntBuffer.allocate(capacity);
		for (int i = 0; i < buffer.capacity(); i++) {
			buffer.put(2*i+1);
		}
		buffer.flip();//重置position limit
		while (buffer.hasRemaining()) {
			System.out.println(buffer.get());
			
		}
		
	}

}

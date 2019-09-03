package com.chinadovey.power.webapps.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SenceChangeTest {
	
	public static void main(String[] args) {
		
		try {
			Socket client = new Socket("192.168.1.18", 9001);
			//Socket client = new Socket("121.196.244.79", 9001);
			byte[] data = {0x7b,0x7b,0x00,0x07,00,0x0A,00,0x00,00,01,00,00,00,01,00,02};
			OutputStream out = client.getOutputStream();
			out.write(data);
			InputStream in = client.getInputStream();
			while (in.read() != -1) {
				System.out.println(in.read());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}

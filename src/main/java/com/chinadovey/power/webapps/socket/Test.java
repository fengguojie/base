package com.chinadovey.power.webapps.socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
	
	public static void main(String[] args) throws IOException {
		try {
			InetAddress address = InetAddress.getByName("192.168.1.18");
			System.out.println(address.getCanonicalHostName());
			System.out.println(address.getHostAddress());//192.168.1.18
			System.out.println(address.getHostName());
			
			InetAddress address2 = InetAddress.getLocalHost();
			System.out.println(address2.getHostAddress());//192.168.1.18
			////////////////以上为自己系的测试
			InetAddress address3 = InetAddress.getByName("cloud.huaching.com");//神奇 知道域名 就可以知道他的IP地址
			System.out.println(address3.isReachable(5000));
			System.out.println(address3.getHostAddress());
			
			InetAddress ip = InetAddress.getByAddress(new byte[]{127,0,0,1});
			System.out.println(ip.isReachable(5000));
			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}

package com.chinadovey.power.webapps.socket;

import java.net.InetSocketAddress;

import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

public class MinaServer {
	
	public static void start() throws Exception{
		IoAcceptor acceptor=new NioSocketAcceptor();    
		acceptor.getSessionConfig().setReadBufferSize(2048);    
		acceptor.getSessionConfig().setIdleTime(IdleStatus.BOTH_IDLE,10);    
		acceptor.bind(new InetSocketAddress(12345)); 
		System.out.println("开始监听12345……");
	}
	public static void main(String[] args) {
		try {
			start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

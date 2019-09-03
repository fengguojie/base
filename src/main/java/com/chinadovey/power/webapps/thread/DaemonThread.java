package com.chinadovey.power.webapps.thread;
/**
 * 守护线程
 * @author feng
 */
public class DaemonThread extends Thread{
	
	@Override
	public void run(){
		for (int i = 0; i < 100; i++) {
			System.out.println(getName()+i);
		}
	}
	
	public static void main(String[] args) {
		Thread thread = new DaemonThread();
		thread.setDaemon(true);
		thread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
		//主线程 执行完毕    后台线程自动灭亡
	}

}

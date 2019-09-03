package com.chinadovey.power.webapps.thread;

public class JoinThread extends Thread{
	
	private priorThread priorThread;
	
	public JoinThread(priorThread priorThread,String name) {
		super(name);
		this.priorThread = priorThread;
		
	}
	
	@Override
	public void run(){
		for (int i = 0; i < 50; i++) {
			try {
				priorThread.join();
				System.out.println(getName()+"变量"+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName()+"变量"+i);
		}
		priorThread priorThread = new priorThread();
		priorThread.start();
		new JoinThread(priorThread,"延迟执行的线程").start();;
		
	}

}

class priorThread extends Thread{
	
	@Override
	public void run(){
		for (int i = 0; i < 50; i++) {
			System.out.println(getName()+"变量"+i);
		}
	}
}

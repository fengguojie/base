package com.chinadovey.power.webapps.thread;

public class ThreadWork extends Thread{
	
	private Account account;
	
	public ThreadWork(Account account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			account.calculate();
		}
	}

}

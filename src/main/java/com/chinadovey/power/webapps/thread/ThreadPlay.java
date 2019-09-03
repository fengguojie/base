package com.chinadovey.power.webapps.thread;

public class ThreadPlay implements Runnable{
	
    private Account account;
	
	public ThreadPlay(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			account.calculate();
		}
		
	}

}

package com.chinadovey.power.webapps.thread;

public class DrawThread extends Thread{
	private Account account;
	private Double drawMoney;
	
	public DrawThread(String name, Account account, Double drawMoney) {
		super(name);
		this.account = account;
		this.drawMoney = drawMoney;
	}

    public void run(){
    	for (int i = 0; i < 10; i++) {
			account.draw(drawMoney);
		}
		
	}
}

package com.chinadovey.power.webapps.thread;

public class DopositThread extends Thread{
	
	private Account account;
	private Double  dopositMoney;
	public DopositThread(String name, Account account, Double dopositMoney) {
		super(name);
		this.account = account;
		this.dopositMoney = dopositMoney;
	}
	public void run(){
		for (int i = 0; i < 10; i++) {
			account.doposit(dopositMoney);
		}
	}
	
	

}

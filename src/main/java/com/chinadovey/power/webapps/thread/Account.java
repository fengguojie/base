package com.chinadovey.power.webapps.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account{
	
	private String acountNo;
	private Double balance;
	private Boolean flag = false;
	
	private Integer total = 10;//总票数
	private Lock lock = new ReentrantLock();

	public Account(String acountNo, Double balance) {
		this.acountNo = acountNo;
		this.balance = balance;
	}
	public synchronized void draw(Double drawMoney){
		try {
			if (!flag) {
				wait();
			}else {
				System.out.println(Thread.currentThread().getName()+"取钱："+drawMoney);
				balance -= drawMoney;
				System.out.println("余额"+balance);
				flag = false;
				notifyAll();
			}
		} catch (InterruptedException ex){
			ex.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public synchronized void doposit(Double dopositMoney){
		try {
			if (flag) {
				wait();
			}else {
				System.out.println(Thread.currentThread().getName()+"存钱:"+dopositMoney);
				balance =+ dopositMoney;
				System.out.println("余额"+balance);
				flag = true;
				notifyAll();
			}
		} catch (InterruptedException ex){
			ex.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public synchronized void calculate2(){
		System.out.println(Thread.currentThread().getName()+total);
		if (total > 0) {
			try {
				Thread.sleep(100);
				total--;
				System.out.println("剩余票数"+total);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		/*if (total <= 0) {
			System.out.println("余票不足");
		}else {
			total--;
		}*/
		
	}
	/**
	 * 为什么  这个锁不起作用 后续研究
	 */
	public  void calculate(){
		//Lock lock = new ReentrantLock();   不能放在这里 因为执行这个方法 就会被实例化一次 所以锁不起作用
		lock.lock();
		System.out.println(Thread.currentThread().getName()+total);
		if (total > 0) {
			try {
				Thread.sleep(100);
				total--;
				System.out.println("剩余票数"+total);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		lock.unlock();
		/*if (total <= 0) {
			System.out.println("余票不足");
		}else {
			total--;
		}*/
		
	}

	public String getAcountNo() {
		return acountNo;
	}

	public void setAcountNo(String acountNo) {
		this.acountNo = acountNo;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
}

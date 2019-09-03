package com.chinadovey.power.webapps.thread;

public class Test {
	/*
	 * 线程的运行状态
	 * 新建  new Thread()
	 * 运行(可运行)  嗲用 start()
	 * 阻塞 当线程需要获得对象的内置所 但是正被其他线程占用
	 * 等待
	 * 计时等待 调用sleep()
	 * 终止 run（）执行完毕或者出现异常
	 * 
	 * 线程的生命周期
	 * 出生状态  创建新线程、调用start()之前
	 * 就绪状态（可执行状态）   调用start()之后
	 * 运行状态  当线程得到系统资源的时候   重要：线程一旦进入可执行状态，他就会在就绪状态和运行状态来回切换
	 * 等待状态  运行状态下的线程调用wait() 进入等待状态 重要：进入等待状态的线程必须调用notify()才能被唤醒
	 * 休眠状态  调用sleep()
	 * 阻塞状态  运行状态下发出输入/输出请求 线程就进入阻塞状态 在其等待输入/输出结束时 进入就绪状态
	 * 死亡状态  run()执行完毕
	 * */
	/**
	 * 使线程进入就绪状态的情况
	 * 1 调用sleep方法
	 * 2 调用wait方法
	 * 3 等待输入/输出完成
	 * 当线程处于就绪状态后，使线程再次进入运行状态的情况
	 * 1 线程调用notify方法
	 * 2 线程调用notifyAll方法
	 * 3 线程调用interr方法
	 * 4 线程休眠时间结束
	 * 5 输入/输出完成
	 * @param args
	 */
	
	public static void main(String[] args) {
		Account account = new Account("20110083", 0d);
		Thread work = new Thread(new ThreadWork(account),"work");
		Thread play = new Thread(new ThreadPlay(account),"play");
		//Thread study = new Thread(new ThreadStudy(),"study");
		work.start();
		play.start();
		
		/*System.out.println("开始执行多线程……");
		Account account = new Account("20110083", 0d);
		new DrawThread("mary", account, 1000d).start();
		new DopositThread("jellard", account, 1000d).start();
		System.out.println("结束执行多线程……");*/
		
		
	}

}

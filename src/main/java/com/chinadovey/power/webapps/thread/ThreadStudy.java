package com.chinadovey.power.webapps.thread;

public class ThreadStudy implements Runnable{
	
	private Integer count;
	private ThreadWork work; 
	
	public ThreadStudy() {
		System.out.println("执行默认构造方法！");
	}
    public ThreadStudy(Integer count,ThreadWork work) {
    	System.out.println("执行自定义构造方法！");
		this.count = count;
		this.work = work;
	}

	@Override
	public void run() {
		try {
			//Thread.sleep(1);
			work.notify();
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName()+": this Thread is study!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}

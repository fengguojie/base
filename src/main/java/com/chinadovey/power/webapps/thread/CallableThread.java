package com.chinadovey.power.webapps.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 带返回值的多线程
 * @author feng
 */
public class CallableThread implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		int i = 0;
		for (; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+"变量的值"+i);
		}
		return i;
	}
	
	public static void main(String[] args) {
		CallableThread ct  = new CallableThread();
		FutureTask<Integer> task = new FutureTask<Integer>(ct);
		new Thread(task,"带返回值的多线程").start();
		
		try {
			System.out.println(task.get());
			System.out.println("组赛线程 执行后");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}

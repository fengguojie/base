package com.chinadovey.power.webapps.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
import org.quartz.core.SampledStatistics;


public class ThreadPoolTest {
	
	public static void main(String[] args) {
		
			ExecutorService cacchePool = Executors.newCachedThreadPool(); //根据需要，系统自行创建缓存 放到线程池中
			ExecutorService fixedPool = Executors.newFixedThreadPool(10);//创建一个指定数量可重用的线程池
			ExecutorService singlePool = Executors.newSingleThreadExecutor();//创建只有一个线程的线程池  相当于参数是1 的第二个线程池
			
			ExecutorService schedulePool = Executors.newScheduledThreadPool(10);//可延迟的线程池
			ExecutorService singleSchedulePool = Executors.newSingleThreadScheduledExecutor();
			
			LinkedBlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<Runnable>();
			ExecutorService executor = new ThreadPoolExecutor(2, 6, 1, TimeUnit.DAYS, workQueue);
	}
	

}

class TaskThread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
		
	}
	
}

package com.chinadovey.power.webapps.thread;

import java.util.Random;

public class ThreadLocalTest implements Runnable{
	private ThreadLocal  studentLocal = new ThreadLocal();
	
	public static void main(String[] args) {
		new Thread(new ThreadLocalTest(),"线程1").start();
		new Thread(new ThreadLocalTest(),"线程2").start();
	}

	@Override
	public void run() {
		accessStudent();
		
	}
	public void accessStudent() {
        String currentThreadName = Thread.currentThread().getName();
        System.out.println(currentThreadName + " is running!");
        Random random = new Random();
        int age = random.nextInt(100);
        System.out.println("thread " + currentThreadName + " set age to:" + age);
        Student student = getStudent();
        student.setAge(age);
        System.out.println("thread " + currentThreadName + " first read age is:" + student.getAge());
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("thread " + currentThreadName + " second read age is:" + student.getAge());
    }
 
    protected Student getStudent() {
        Student student = (Student) studentLocal.get();
        if (student == null) {
            student = new Student();
            studentLocal.set(student);
        }
        return student;
    }

}

class Student {
    private int age = 0; 
 
    public int getAge() {
        return this.age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
}

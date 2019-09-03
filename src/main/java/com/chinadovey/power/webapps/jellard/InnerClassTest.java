package com.chinadovey.power.webapps.jellard;

import java.util.jar.Attributes.Name;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 
 * @author huaching01160510
 *
 */
public class InnerClassTest {
	private static String carno="jie";
	private String name;
	public InnerClassTest(){}
	
	public InnerClassTest(String name){
		this.name=name;
	}
	
	//非静态 内部类可以访问外部类的私有成员或者方法；反之不可以
	public class InnerClass{
		private String color;
		public InnerClass(){}
		public InnerClass(String color){
			this.color=color;
		}
		public void info(){
			System.out.println(name+":"+color);
		}
	}
	//静态内部类 
	public static class StaticInnerClass{
		private static Integer age=20;
		private String carno;
		public StaticInnerClass(){}
		public StaticInnerClass(String carno){
			this.carno=carno;
		}
		public void info(){
			System.out.println(carno+InnerClassTest.carno);
		}
	}
	//局部内部类  实例化只能在方法内
	public void info(){
		class Inner{
			private String sex;
			public Inner(){}
			public Inner(String sex){
				this.sex=sex;
			}
			public void info(){
				System.out.println(sex);
			}
		}
		new Inner("jellard").info();
	}
	//匿名内部类 必须继承（只能一个）一个类或者实现一个接口  创建的时候 直接实例化；只会执行一次 
	//不能定义构造器  因为没有类名
	
	public static void main(String[] args) {
		InnerClassTest.InnerClass innerClass = new InnerClassTest("outter").new InnerClass("red");
		innerClass.info();
		InnerClassTest.StaticInnerClass s1 = new StaticInnerClass("blue");//类似于包空间
		StaticInnerClass s2 = new InnerClassTest.StaticInnerClass("yellow");
		s1.info();
		s2.info();
		System.out.println(InnerClassTest.StaticInnerClass.age);
		new InnerClassTest().info();
		
	}
	

}

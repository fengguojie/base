package com.chinadovey.power.webapps.jellard;

import org.apache.zookeeper.server.FinalRequestProcessor;

public class Outter {
	
	private String name;
	private Integer age;
	
	private class MemberInner{
		private String name;
		public MemberInner(String name) {
			this.name = name;
		}
		private void show() {
			System.out.println(name);
		}
	}
	private static class StaticInner{
		private String name;
		public StaticInner(String name) {
			this.name = name;
		}
		private void show() {
			System.out.println(name);
		}
	}
	public void show(String name){
		class functionInner{
			private String name;
			public functionInner(String name) {
				this.name = name;
			}
			private void show(){
				System.out.println(name);
			}
		}
		new functionInner(name).show();
	}
	public void noName(final String name){
		new NoName(){
            @Override
			public void show() {
			   System.out.println(name);
			}
		};
	}
	public static void main(String[] args) {
		Outter.MemberInner inner = new Outter().new MemberInner("我是成员内部类");
		inner.show();
		
		Outter.StaticInner staticInner = new StaticInner("我是静态内部类");
		staticInner.show();
		
		new Outter().show("我是局部内部类");
		new Outter().noName("我是匿名内部类");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}
	

}

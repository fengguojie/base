package com.chinadovey.power.webapps.jellard;

/**
 * 常量池（constant pool）:是指编译期被确定，放在.class文件中的数据
 * 一般为：类、接口、方法中的常量以及字符串直接量
 * @author huaching01160510
 *
 */
public class Learn01 {
	
	public String name="base";
	
    public void play(int a,int b){
		System.out.println("base play");
	}
	
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "he"+"llo";//字符串直接量 编译器确定他的值
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		
	}
	public String toString(){
		System.out.println("自动执行 base");
		return null;
	}

}

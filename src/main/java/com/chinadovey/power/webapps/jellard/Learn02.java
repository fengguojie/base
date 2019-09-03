package com.chinadovey.power.webapps.jellard;

import java.util.Date;
import java.util.jar.Attributes.Name;

import org.apache.bcel.generic.ReturnaddressType;

/**
 * java 运行机制
 * 成员变量（静态，非静态） 存放在堆区 自动初始化
 * 局部变量 保存在栈中   不会自动初始化，等到用的时候才会去分配内存，用完就回收
 * static 可以修饰除了构造器之外其他四种类的成员；并且是在初始化类的时候 分配内存；新建对象并不会再次分配内存
 * 
 * 
 * 向上转型：子类的对象赋值给父类的引用变量（特点：系统自动完成）
 * 
 * 类的成员（有且只有五种）：
 * 1：成员变量
 * 2：方法
 * 3：构造器
 * 4：初始化块：new 对象的时候 静态代码块（类加载的时候只会执行一次）》一般初始化块（执行多次，与构造器交替执行）》构造器（执行多次）
 * 5：内部类(包括接口和枚举)
 * @author feng
 *
 */
public class Learn02 extends Learn01{
	
	private static Integer id;
	private String name="sub";
	private Date startTime;
	
	public void play(int a,int b){
		System.out.println("sub play");
	}
	public static void main(String[] args) {
		
		/**
		 * 引用变量分为：运行时引用变量、编译时引用变量
		 * 编译时base引用变量（实际就是一个指针）的类型：Learn01
		 * 运行时base引用变量（实际就是一个指针）的类型：Learn02
		 * 成员变量 访问的是编译时期 所定义的成员变量值
		 */
		Learn01 base = new Learn02();//向上转型
		System.out.println(base.name);
		base.play(1, 2);
		
		
		//因为println要求的参数是字符串类型，所以这句话的意思base+"";此时系统自动调用toString()方法
		System.out.println(base);
		
	}
	public String toString(){
		System.out.println("自动执行 sub");
		return null;
	}

}

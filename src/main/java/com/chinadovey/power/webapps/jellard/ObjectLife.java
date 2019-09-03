package com.chinadovey.power.webapps.jellard;

/**
 * 对象与垃圾回收
 * @author huaching01160510
 *
 */
public class ObjectLife {
	/**
	 * 当一个对象在堆内存运行时，根据引用他的引用变量分为三种状态
	 * 1：可达状态  有一个或以上引用变量引用他
	 * 2：可恢复状态  当没有引用他的引用变量 计入可恢复状态 垃圾回收机制准备回收，回收之前调用finalize()清理资源；试图唤醒引用变量
	 * 3：不可达状态  如果唤醒成功，则进行可达状态否则 进入不可达状态；立即回收；
	 * 
	 * 引用变量的引用类型
	 * 强引用：
	 * 软引用：
	 * 虚引用：
	 * 弱引用：
	 */
	public ObjectLife(){}
	private ObjectLife(int a){
		
	}
	
	static{
		System.out.println("我被执行了");
		a = 6;
	}
	{
		System.out.println("我是初始化块");
	}
	private static Integer a = 10;
	private static final Integer b = 10;
	private static final String name="jellard";
	
	public static void main(String[] args) {
		ObjectLife obj1;
		System.out.println(ObjectLife.name);
		ObjectLife obj2;
	}
	public void get(){
		System.out.println("执行get");
	}

}

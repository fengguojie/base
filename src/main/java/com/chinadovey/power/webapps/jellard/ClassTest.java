package com.chinadovey.power.webapps.jellard;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.jar.Attributes.Name;

/**
 * 类加载机制
 * 反射：
 * 1:可以创建对象：newInstance() 
 * 2:可以直接调用方法 invoke();如果没有权限 可以直接setAccessible(true)获得权限（牛 可以调用私有构造函数）
 * AOP
 * @author feng
 */
public class ClassTest {

	//类加载机制：当程序主动使用某个类的时候，如果该类还没有加载到内存中；
	//         则系统会通过加载、链接、初始化三个步骤对类进行初始化；
	//类加载是指将.class文件读入内存，并且为之创建一个java.lang.Class对象
	//类 是一个特殊的对象（深思） 
	
	/**
	 * JVM类加载机制
	 * 1全盘负责  当一个类加载器需要加载一个Class，其引用的Class也有该类加载器自己加载。
	 * 2父类委托 委托父类加载器加载Class
	 * 3缓存机制 所有加载过的Class都会放入缓存，这也是为什么修改了class后，重启JVM才会生效
	 */
	public static String name = "feng";
	
	//通过反射得到类的构造方法
	public void getConstructorByClass(Class<ObjectLife> class1) throws NoSuchMethodException, SecurityException {
		String className = class1.getName();
		System.out.println(className);
		Constructor<ObjectLife>[] constructor = (Constructor<ObjectLife>[])class1.getConstructors();//得到所有共有的构造器
		Constructor<ObjectLife> constructors = class1.getConstructor();
		for (Constructor<ObjectLife> c : constructor) {
			System.out.println(c);//自动调用toSting（）
			try {
				c.newInstance().get();//个人觉得 这才是反射的核心
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		Constructor<?>[] constructors2 = class1.getDeclaredConstructors();//得到所有的构造器
		Constructor<?> constructor2 = class1.getDeclaredConstructor();
		for (Constructor<?> c : constructors2) {
			System.out.println(c);//自动调用toSting（）
		}
	}
	//通过反射得到类的方法(字段的一样 不重复写了)
	public void getMethodByClass(Class<?> class1) throws NoSuchMethodException, SecurityException {
		Method[] methods = class1.getMethods();//得到所有共有的方法
		Method method = class1.getMethod("classname");
		Method[] methods2 = class1.getDeclaredMethods();//得到所有的方法
		Method method2 = class1.getDeclaredMethod("classname");
	}
	public static void main(String[] args) {
		ClassTest test = new ClassTest();
		try {
			test.getConstructorByClass(ObjectLife.class);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		/*System.out.println(name);
		Class class1 = ClassTest.class;
		Field[] fields = class1.getFields();
		System.out.println(fields.length);
		for (Field field : fields) {
			System.out.println(field);
			try {
				field.set(field.getName(), "jellard");
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name);*/
	}
	public static byte[] encryptSHA(byte[] data) throws Exception {
		MessageDigest sha = MessageDigest.getInstance("123456");
		sha.update(data);
		return sha.digest();
	}
	
}

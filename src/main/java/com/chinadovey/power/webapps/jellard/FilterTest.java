package com.chinadovey.power.webapps.jellard;

import java.lang.reflect.Method;

public class FilterTest {
	
	@Filter
	public void  notImportant(String sex,Integer age){
		
	}
	public static void main(String[] args) {
		Class<?> test = FilterTest.class;
		Class<?>[] types = new Class<?>[2];
		types[0]=String.class;
		types[1]=Integer.class;
		try {
			Method method = test.getMethod("notImportant", types);
			Filter ff = method.getAnnotation(Filter.class);
			System.out.println(ff.name()+ff.value());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}

}

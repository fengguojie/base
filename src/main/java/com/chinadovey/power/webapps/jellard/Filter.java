package com.chinadovey.power.webapps.jellard;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Filter {
	/**
	 * 根据  Annotation有无成员变量 分为两类
	 * 1：标记注解     比如 Override
	 * 2：元数据注解  比如 Filter
	 * @return
	 */
	String name() default "parking";//name 其实是成员变量 只是写法类似于方法（形参必须为空）
	String value() default "jellard";
	
	

}

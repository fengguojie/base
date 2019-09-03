package com.chinadovey.power.webapps.vo;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

public class DataSourceAspect {
	 public void exchangeDataSource(JoinPoint point)  
	    {  
	        Object target = point.getTarget();  
	        String method = point.getSignature().getName();  
	  
	        Class<?>[] classz = target.getClass().getInterfaces(); 
	        Class<?>[] parameterTypes = ((MethodSignature)point.getSignature()).getMethod().getParameterTypes();  
	        try {  
	            Method m = classz[0].getMethod(method, parameterTypes);  
	            if (m != null && m.isAnnotationPresent(DateSource.class)) {  
	            	DateSource data = m  
	                        .getAnnotation(DateSource.class);  
	            	DatabaseContextHolder.setDbType(data.value());  
	                System.out.println(data.value());  
	            }  
	              
	        } catch (Exception e) {  
	           e.printStackTrace(); 
	        }  
	    }  

}

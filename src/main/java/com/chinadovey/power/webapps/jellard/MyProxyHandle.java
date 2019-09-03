package com.chinadovey.power.webapps.jellard;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxyHandle implements InvocationHandler{
	
	private Object target;
	public void setTarget(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		LogJellard log = new LogJellard();
		log.before();
		Object result = method.invoke(target, args);
		log.after();
		return result;
	}
	

}

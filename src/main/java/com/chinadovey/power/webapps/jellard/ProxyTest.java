package com.chinadovey.power.webapps.jellard;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Target;
import java.lang.reflect.Proxy;


public class ProxyTest {
	
	
	public static void main(String[] args) {
		MyProxyHandle handle = new MyProxyHandle();
		Dog dog = new DogImpl();
		handle.setTarget(dog);
		dog = (Dog) Proxy.newProxyInstance(Dog.class.getClassLoader(), 
				dog.getClass().getInterfaces(), handle);
		dog.eat();
		dog.play();
		
		
		
	}

}

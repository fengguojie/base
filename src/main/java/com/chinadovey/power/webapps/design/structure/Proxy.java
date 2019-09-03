package com.chinadovey.power.webapps.design.structure;
/**
 * 代理模式
 * @author feng
 */
interface Sourceable2 {  
    public void method();  
} 
class Source2 implements Sourceable2 {  
	  
    @Override  
    public void method() {  
        System.out.println("the original method!");  
    }  
}

class Proxy implements Sourceable2 {  
	  
    private Source2 source;  
    public Proxy(){  
        super();  
        this.source = new Source2();//与装饰器模式不一样的地方  
    }  
    @Override  
    public void method() {  
        before();  
        source.method();  
        atfer();  
    }  
    private void atfer() {  
        System.out.println("after proxy!");  
    }  
    private void before() {  
        System.out.println("before proxy!");  
    }  
} 
class ProxyTest {  
	  
    public static void main(String[] args) {  
        Sourceable2 source = new Proxy();  
        source.method();  
    } 
}

package com.chinadovey.power.webapps.design.structure;

/**
 * 装饰器模式（和代理很像）
 * @author feng
 */
interface Sourceable1 {  
    public void method();  
} 
class Source1 implements Sourceable1 {  
	  
    @Override  
    public void method() {  
        System.out.println("the original method!");  
    }  
}  
class Decorator implements Sourceable1 {  
	  
    private Sourceable1 source;  
      
    public Decorator(Sourceable1 source){  
        super();  
        this.source = source;  
    }  
    @Override  
    public void method() {  
        System.out.println("before decorator!");  
        source.method();  
        System.out.println("after decorator!");  
    }  
} 
class DecoratorTest {  
	  
    public static void main(String[] args) {  
        Sourceable1 source = new Source1();//对客户端不隐藏原有的行为  
        Sourceable1 obj = new Decorator(source);  
        obj.method();  
    }  
}  

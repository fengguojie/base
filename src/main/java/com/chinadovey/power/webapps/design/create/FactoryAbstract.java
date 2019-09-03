package com.chinadovey.power.webapps.design.create;

/**
 * 创建型模式-》抽象工厂模式
 * @author feng
 * 个人理解;本模式是对静态工厂模式的改进 更加符合设计模式的闭合原则，可扩展性更好；
 */
public class FactoryAbstract {
	public static void main(String[] args) {
		Receive receive = new MobileReceiveFactory().produce();
		receive.receive();
	}

}

interface Receive{
	void receive();
}
class MailReceive implements Receive{

	@Override
	public void receive() {
		System.out.println("通过邮件接收");
	}
	
}
class MobileReceive implements Receive{

	@Override
	public void receive() {
		System.out.println("通过手机接收");
	}
	
}

interface Provider {  
    public Receive produce();  
}
class MailReceiveFactory implements Provider {  
    
    @Override  
    public MailReceive produce(){  
        return new MailReceive();  
    }  
}
class MobileReceiveFactory implements Provider {  
    
    @Override  
    public MobileReceive produce(){  
        return new MobileReceive();  
    }  
}  

package com.chinadovey.power.webapps.design.create;

/**
 * 创建型模式-》工厂方法模式
 * 适用：凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建。
 * @author feng
 */
public class FactoryMethod {
	
	public static void main(String[] args) {
		Sender sender = new SendFactory().produce("mail");//第一种工厂方法
		sender.send();
		
		Sender sender2 = new SendFactory2().produceMail();//第二种工厂方法
		sender2.send();
		
		Sender sender3 = SendFactory3.produceMail();//第三种工厂方法
		sender3.send();
		
	}

}

interface Sender{
	void send();
}
class MailSender implements Sender{

	@Override
	public void send() {
		System.out.println("通过邮件发送");
	}
	
}
class MobileSender implements Sender{

	@Override
	public void send() {
		System.out.println("通过手机发送");
	}
	
}
//第一种   通过传递字符串 创建子类对象    缺点：字符串传递出错就导致不能创建需要的对象
class SendFactory {
	
	public Sender produce(String type) {  
        if ("mail".equals(type)) {  
            return new MailSender();  
        } else if ("mobile".equals(type)) {  
            return new MobileSender();  
        } else {  
            System.out.println("请输入正确的类型!");  
            return null;  
        }  
    }
	
}
//第二种 （第一种的改进版） 工厂提供创建多个子类对象的方法
class SendFactory2 {
	
    public Sender produceMail(){  
       return new MailSender();  
    }  
      
    public Sender produceSms(){  
       return new MobileSender();  
    }  
}
//第三种 （第二种的改进版） 第二种工厂模式创建实例的时候 需要先创建一个工厂类的对象  改进办法：静态化创建方法
class SendFactory3 {
	
    public static Sender produceMail(){  
       return new MailSender();  
    }  
      
    public static Sender produceSms(){  
       return new MobileSender();  
    }  
}

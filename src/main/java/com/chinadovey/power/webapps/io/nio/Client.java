package com.chinadovey.power.webapps.io.nio;

public class Client {  
    private static String DEFAULT_HOST = "192.168.1.18";  
    private static int DEFAULT_PORT = 9002;  
    private static ClientHandle clientHandle;  
    public static void start(){  
        start(DEFAULT_HOST,DEFAULT_PORT);  
    }  
    public static synchronized void start(String ip,int port){  
        if(clientHandle!=null)  
            clientHandle.stop();  
        clientHandle = new ClientHandle(ip,port);  
        new Thread(clientHandle,"Server").start();  
    }  
    //向服务器发送消息  
    public static boolean sendMsg(String msg) throws Exception{  
        if(msg.equals("q")) return false;  
        clientHandle.sendMsg(msg);  
        return true;  
    }  
    public static void main(String[] args){  
        start();  
    }  
}  

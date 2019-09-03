package com.chinadovey.power.webapps.design;

import java.util.ArrayList;
import java.util.List;

public class Observer {
	 public static void main(String[] args)  
     {  
          Transporter transporter = new Transporter();  
  
          Police police = new Police();  
          Security security = new Security();  
          Thief thief = new Thief();  
  
          transporter.addWatcher(police);  
          transporter.addWatcher(security);  
          transporter.addWatcher(security);  
  
          transporter.notifyWatchers();  
     } 

}


//抽象的观察者
interface Watcher {  
     public void update();  
} 

//抽象的被观察者，在其中声明方法（添加、移除观察者，通知观察者）
interface Watched {  
     public void addWatcher(Watcher watcher);  
  
     public void removeWatcher(Watcher watcher);  
  
     public void notifyWatchers();  
}

//具体的观察者  保镖
class Security implements Watcher  
{  
    @Override  
    public void update(){ 
    	System.out.println("运输车有行动，保安贴身保护");
    }  
} 
//具体的观察者  强盗
class Thief implements Watcher  
{  
     @Override  
     public void update(){  
          System.out.println("运输车有行动，强盗准备动手");  
     }  
}
//具体的观察者  警察
class Police implements Watcher  
{  
    @Override  
    public void update(){  
         System.out.println("运输车有行动，警察护航");  
    }  
}

//具体的被观察者
class Transporter implements Watched  
{  
     private List<Watcher> list = new ArrayList<Watcher>();  
  
     @Override  
     public void addWatcher(Watcher watcher){  
          list.add(watcher);  
     }  
  
     @Override  
     public void removeWatcher(Watcher watcher){  
          list.remove(watcher);  
     }  
  
     @Override  
     public void notifyWatchers(){  
          for (Watcher watcher : list){  
               watcher.update();  
          }  
     }
}  

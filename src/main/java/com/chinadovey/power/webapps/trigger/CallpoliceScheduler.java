package com.chinadovey.power.webapps.trigger;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class CallpoliceScheduler {
	final Logger logger = Logger.getLogger(CallpoliceScheduler.class);
	
	
	
	
	public void  findAll(){
		try{
			/*List<CarLock> list=carLockBiz.getAll();
			for(CarLock oo:list){
				String slaveId = oo.getSlaveId();
				boolean resule=   carLockDataBiz.find(slaveId);
				if(resule==false){
					carLockBiz.update(slaveId);
				}
			}*/
		}catch(Exception e){
			e.printStackTrace();
			logger.error("更新车锁状态失败",e);
		}
	}
}

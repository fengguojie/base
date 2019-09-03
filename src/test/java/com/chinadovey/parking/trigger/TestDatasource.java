package com.chinadovey.parking.trigger;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chinadovey.power.webapps.biz.DataTotalBiz;
import com.chinadovey.power.webapps.pojo.PowerCdmeterdataTotal;

@ContextConfiguration({ "classpath:config/spring-core.xml", "classpath:config/spring-webapp.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDatasource {
	
	 @Autowired
	 private DataTotalBiz dataTotalBiz; 
	 
	 @Test
	 public void testDao() {
		 try {
			List<PowerCdmeterdataTotal> list = dataTotalBiz.getAllByCollectTime();
			System.out.println(list.size());
			List<PowerCdmeterdataTotal> list2 = dataTotalBiz.getAllByCollectTime(new Date());
			System.out.println(list2.size());
			System.out.println("结束");
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
     }    

}

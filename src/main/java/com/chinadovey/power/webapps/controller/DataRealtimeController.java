package com.chinadovey.power.webapps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinadovey.power.core.mvc.AbstractBaseController;
import com.chinadovey.power.webapps.biz.DataRealtimeBiz;
import com.chinadovey.power.webapps.util.JedisUtil;

import net.sf.json.JSONObject;

@RequestMapping("/test")
@Controller
public class DataRealtimeController extends AbstractBaseController{
	
	@Autowired
	private DataRealtimeBiz dataRealtimeBiz;
	/*@Autowired
	private JedisUtil jedisUtil;*/
	
	
	@RequestMapping("/add")
	@ResponseBody
	public JSONObject add(String carLock){
		JSONObject json = new JSONObject();
		try {
			/*jedisUtil.getJedis().rename("fengguojie", "testConn");
			long ss = jedisUtil.getJedis().dbSize();
			
			json.put("dbsize", ss);
			json.put("result", true);*/
			return json;
		} catch (Exception e) {
			e.printStackTrace();
			json.put("result", false);
			return json;
		}
	}
	
}

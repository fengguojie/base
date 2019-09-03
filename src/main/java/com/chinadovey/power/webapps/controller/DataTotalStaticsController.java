package com.chinadovey.power.webapps.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinadovey.power.core.mvc.AbstractBaseController;
import com.chinadovey.power.webapps.biz.CdmeterCacheBiz;
import com.chinadovey.power.webapps.biz.DataTotalBiz;
import com.chinadovey.power.webapps.biz.DataTotalSingleBiz;
import com.chinadovey.power.webapps.pojo.PowerCdmeterdataTotal;
import com.chinadovey.power.webapps.pojo.PowerCdmeterdataTotalSingle;
import com.chinadovey.power.webapps.pojo.temp.PowerCdmeterdataTotalHour;
import com.chinadovey.power.webapps.util.DateUtils;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
/**
 * 能耗数据统计接口
 * 数据流向：原始数据-》统计表（小时）
 * @author feng
 */
@RequestMapping("/dataTotalStatics")
@Controller
public class DataTotalStaticsController extends AbstractBaseController{
	@Autowired
	private DataTotalBiz dataTotalBiz;
	@Autowired
	private DataTotalSingleBiz dataTotalSingleBiz;
	
	/**
	 * 非瞬时数据统计接口
	 * @param totalHours:需要统计的三相表数据   统计之后返回
	 * @param singleTotalHours:需要统计的单相表数据   统计之后返回
	 * @return
	 */
	@RequestMapping("/statisticsHour")
	@ResponseBody
	public JSONObject statisticsHour(String totalHours,String singleTotalHours){
		JSONObject json = new JSONObject();
		try {
			List<PowerCdmeterdataTotalHour> allData = new ArrayList<PowerCdmeterdataTotalHour>();
			
			JSONArray array = JSONArray.fromObject(totalHours);
			List<PowerCdmeterdataTotalHour> list = JSONArray.toList(array, PowerCdmeterdataTotalHour.class);//统计表 原始数据
			for (PowerCdmeterdataTotalHour totalHour : list) {
				Date startTime = totalHour.getCollectTime();
				String startStr = DateUtils.dateConvertString(startTime, 3);
				Date endTime = DateUtils.stringFormatDateByTypeAndPosition(startStr, "hour", 1);
				Long equiId = totalHour.getEquiId();
				List<PowerCdmeterdataTotal> totals = dataTotalBiz.getNeedStatistics(equiId,startTime,endTime);
				if (totals != null && !totals.isEmpty()) {
					if(totals.size() == 1){
						totalHour.setEquiTee(0.05d);
						totalHour.setEquiTsee(0.01d);
						totalHour.setEquiThee(0.01d);
						totalHour.setEquiTnee(0.01d);
						totalHour.setEquiTlee(0.01d);
						totalHour.setEquiWqp(0.01d);
					}else{
						totalHour.setEquiTee(totals.get(totals.size()-1).getEquiTee()-totals.get(0).getEquiTee());
						totalHour.setEquiTsee(totals.get(totals.size()-1).getEquiTsee()-totals.get(0).getEquiTsee());
						totalHour.setEquiThee(totals.get(totals.size()-1).getEquiThee()-totals.get(0).getEquiThee());
						totalHour.setEquiTnee(totals.get(totals.size()-1).getEquiTnee()-totals.get(0).getEquiTnee());
						totalHour.setEquiTlee(totals.get(totals.size()-1).getEquiTlee()-totals.get(0).getEquiTlee());
						totalHour.setEquiWqp(totals.get(totals.size()-1).getEquiWqp()-totals.get(0).getEquiWqp());
                    }
				}
				allData.add(totalHour);
			}
			
			JSONArray sArray = JSONArray.fromObject(singleTotalHours);
			List<PowerCdmeterdataTotalHour> slist = JSONArray.toList(sArray, PowerCdmeterdataTotalHour.class);//统计表 原始数据
			for (PowerCdmeterdataTotalHour totalHour : slist) {
				Date startTime = totalHour.getCollectTime();
				String startStr = DateUtils.dateConvertString(startTime, 3);
				Date endTime = DateUtils.stringFormatDateByTypeAndPosition(startStr, "day", 1);
				Long equiId = totalHour.getEquiId();
				List<PowerCdmeterdataTotalSingle> totals = dataTotalSingleBiz.getNeedStatistics(equiId,startTime,endTime);
				if (totals != null && !totals.isEmpty()) {
					if(totals.size() == 1){
						totalHour.setEquiTee(0.05d);
						totalHour.setEquiTsee(0.01d);
						totalHour.setEquiThee(0.01d);
						totalHour.setEquiTnee(0.01d);
						totalHour.setEquiTlee(0.01d);
						totalHour.setEquiWqp(0.01d);
					}else{
						totalHour.setEquiTee(totals.get(totals.size()-1).getEquiTee()-totals.get(0).getEquiTee());
						totalHour.setEquiTsee(totals.get(totals.size()-1).getEquiTsee()-totals.get(0).getEquiTsee());
						totalHour.setEquiThee(totals.get(totals.size()-1).getEquiThee()-totals.get(0).getEquiThee());
						totalHour.setEquiTnee(totals.get(totals.size()-1).getEquiTnee()-totals.get(0).getEquiTnee());
						totalHour.setEquiTlee(totals.get(totals.size()-1).getEquiTlee()-totals.get(0).getEquiTlee());
						totalHour.setEquiWqp(totals.get(totals.size()-1).getEquiWqp()-totals.get(0).getEquiWqp());
                    }
				}
				allData.add(totalHour);
			}
			
			JSONArray backList = JSONArray.fromObject(allData);
			logger.debug("统计后数据的数量："+backList.size());
	        json.put("data", backList.toString());
			json.put("result", true);
			return json;
		} catch (Exception e) {
			logger.error(e.getMessage());
			json.put("result", false);
			return json;
		}
	}
	
	
	
}

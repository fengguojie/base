package com.chinadovey.power.webapps.biz;

import java.util.Date;
import java.util.List;

import com.chinadovey.power.webapps.biz.base.BaseBiz;
import com.chinadovey.power.webapps.pojo.PowerCdmeterdataTotal;
import com.chinadovey.power.webapps.vo.DateSource;

public interface DataTotalBiz extends BaseBiz<PowerCdmeterdataTotal>{

	/**
	 * 默认（也就是第一次） 拿当前表 前五百条数据
	 * @return
	 */
	@DateSource("master")
	List<PowerCdmeterdataTotal> getAllByCollectTime();
    /**
     * 查出 比参数时间大于或者等于的前五百条数据
     * @param collectTime
     * @return
     */
	@DateSource("slaver")
	List<PowerCdmeterdataTotal> getAllByCollectTime(Date collectTime);
	/**
	 * 获得 三相表 需要统计的数据
	 * @param equiId
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	List<PowerCdmeterdataTotal> getNeedStatistics(Long equiId, Date startTime,Date endTime);
	
	

	
}

package com.chinadovey.power.webapps.biz.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinadovey.power.core.supports.mybatis.pagination.PageContext;
import com.chinadovey.power.core.supports.mybatis.pagination.Pagination;
import com.chinadovey.power.webapps.biz.DataTotalBiz;
import com.chinadovey.power.webapps.biz.base.BaseBizImpl;
import com.chinadovey.power.webapps.mappers.base.BaseMapper;
import com.chinadovey.power.webapps.mappers.gen.PowerCdmeterdataTotalMapper;
import com.chinadovey.power.webapps.pojo.PowerCdmeterdataTotal;
import com.chinadovey.power.webapps.pojo.PowerCdmeterdataTotalExample;
import com.chinadovey.power.webapps.vo.DateSource;
@Service
public class DataTotalBizImpl extends BaseBizImpl<PowerCdmeterdataTotal> implements DataTotalBiz{

	@Autowired
	private PowerCdmeterdataTotalMapper mapper;
	@Override
	public BaseMapper<PowerCdmeterdataTotal> getMapper() {
		return mapper;
	}
	@Override
	public List<PowerCdmeterdataTotal> getAllByCollectTime() {
		PowerCdmeterdataTotalExample example = new PowerCdmeterdataTotalExample();
		example.setOrderByClause("collect_time asc");
		Pagination<?> pagin = PageContext.initialize(0, 50);
		List<PowerCdmeterdataTotal> list = mapper.selectByExample(example, pagin.getRowBounds());
		return list;
	}
	@Override
	public List<PowerCdmeterdataTotal> getAllByCollectTime(Date collectTime) {
		PowerCdmeterdataTotalExample example = new PowerCdmeterdataTotalExample();
		example.createCriteria().andCollectTimeGreaterThanOrEqualTo(collectTime);
		example.setOrderByClause("collect_time asc");
		Pagination<?> pagin = PageContext.initialize(0, 500);
		List<PowerCdmeterdataTotal> list = mapper.selectByExample(example, pagin.getRowBounds());
		return list;
	}
	@Override
	public List<PowerCdmeterdataTotal> getNeedStatistics(Long equiId, Date startTime,Date endTime) {
		PowerCdmeterdataTotalExample example = new PowerCdmeterdataTotalExample();
		example.createCriteria().andEquiIdEqualTo(equiId).andCollectTimeBetween(startTime, endTime);
		example.setOrderByClause("collect_time asc");
		List<PowerCdmeterdataTotal> list = mapper.selectByExample(example);
		return list;
	}
	
	
}

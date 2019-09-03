package com.chinadovey.power.webapps.biz.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinadovey.power.core.supports.mybatis.pagination.PageContext;
import com.chinadovey.power.core.supports.mybatis.pagination.Pagination;
import com.chinadovey.power.webapps.biz.DataTotalSingleBiz;
import com.chinadovey.power.webapps.biz.base.BaseBizImpl;
import com.chinadovey.power.webapps.mappers.base.BaseMapper;
import com.chinadovey.power.webapps.mappers.gen.PowerCdmeterdataTotalSingleMapper;
import com.chinadovey.power.webapps.pojo.PowerCdmeterdataTotalExample;
import com.chinadovey.power.webapps.pojo.PowerCdmeterdataTotalSingle;
import com.chinadovey.power.webapps.pojo.PowerCdmeterdataTotalSingleExample;
@Service
public class DataTotalSingleBizImpl extends BaseBizImpl<PowerCdmeterdataTotalSingle> implements DataTotalSingleBiz{

	@Autowired
	private PowerCdmeterdataTotalSingleMapper mapper;
	@Override
	public BaseMapper<PowerCdmeterdataTotalSingle> getMapper() {
		return mapper;
	}
	@Override
	public List<PowerCdmeterdataTotalSingle> getAllByCollectTime() {
		PowerCdmeterdataTotalSingleExample example = new PowerCdmeterdataTotalSingleExample();
		example.setOrderByClause("collect_time asc");
		Pagination<?> pagin = PageContext.initialize(0, 500);
		List<PowerCdmeterdataTotalSingle> list = mapper.selectByExample(example, pagin.getRowBounds());
		return list;
	}
	@Override
	public List<PowerCdmeterdataTotalSingle> getAllByCollectTime(Date collectTime) {
		PowerCdmeterdataTotalSingleExample example = new PowerCdmeterdataTotalSingleExample();
		example.createCriteria().andCollectTimeGreaterThanOrEqualTo(collectTime);
		example.setOrderByClause("collect_time asc");
		Pagination<?> pagin = PageContext.initialize(0, 500);
		List<PowerCdmeterdataTotalSingle> list = mapper.selectByExample(example, pagin.getRowBounds());
		return list;
	}
	@Override
	public List<PowerCdmeterdataTotalSingle> getNeedStatistics(Long equiId, Date startTime, Date endTime) {
		PowerCdmeterdataTotalSingleExample example = new PowerCdmeterdataTotalSingleExample();
		example.createCriteria().andEquiIdEqualTo(equiId).andCollectTimeBetween(startTime, endTime);
		example.setOrderByClause("collect_time asc");
		List<PowerCdmeterdataTotalSingle> list = mapper.selectByExample(example);
		return list;
	}
	
}

package com.chinadovey.power.webapps.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinadovey.power.webapps.biz.DataRealtimeSingleBiz;
import com.chinadovey.power.webapps.biz.base.BaseBizImpl;
import com.chinadovey.power.webapps.mappers.base.BaseMapper;
import com.chinadovey.power.webapps.mappers.gen.PowerCdmeterdataRealtimeSingleMapper;
import com.chinadovey.power.webapps.pojo.PowerCdmeterdataRealtimeSingle;
@Service
public class DataRealtimeSingleBizImpl extends BaseBizImpl<PowerCdmeterdataRealtimeSingle> implements DataRealtimeSingleBiz{

	@Autowired
	private PowerCdmeterdataRealtimeSingleMapper mapper;
	@Override
	public BaseMapper<PowerCdmeterdataRealtimeSingle> getMapper() {
		return mapper;
	}
	
}

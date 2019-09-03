package com.chinadovey.power.webapps.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinadovey.power.webapps.biz.DataRealtimeBiz;
import com.chinadovey.power.webapps.biz.base.BaseBizImpl;
import com.chinadovey.power.webapps.mappers.base.BaseMapper;
import com.chinadovey.power.webapps.mappers.gen.PowerCdmeterdataRealtimeMapper;
import com.chinadovey.power.webapps.pojo.PowerCdmeterdataRealtime;
@Service
public class DataRealtimeBizImpl extends BaseBizImpl<PowerCdmeterdataRealtime> implements DataRealtimeBiz{

	@Autowired
	private PowerCdmeterdataRealtimeMapper mapper;
	@Override
	public BaseMapper<PowerCdmeterdataRealtime> getMapper() {
		return mapper;
	}
	
}

package com.chinadovey.power.webapps.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinadovey.power.webapps.biz.CdmeterCacheBiz;
import com.chinadovey.power.webapps.biz.base.BaseBizImpl;
import com.chinadovey.power.webapps.mappers.base.BaseMapper;
import com.chinadovey.power.webapps.mappers.gen.CdmeterCacheDataMapper;
import com.chinadovey.power.webapps.pojo.CdmeterCacheData;
import com.chinadovey.power.webapps.pojo.CdmeterCacheDataExample;
@Service
public class CdmeterCacheBizImpl extends BaseBizImpl<CdmeterCacheData> implements CdmeterCacheBiz{

	@Autowired
	private CdmeterCacheDataMapper mapper;
	@Override
	public BaseMapper<CdmeterCacheData> getMapper() {
		return mapper;
	}
	@Override
	public CdmeterCacheData getCacheData(Integer type) {
		CdmeterCacheDataExample example = new CdmeterCacheDataExample();
		example.createCriteria().andTypeEqualTo(type);
		List<CdmeterCacheData> list = mapper.selectByExample(example);
		if (list != null && !list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}
	
}

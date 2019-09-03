package com.chinadovey.power.webapps.biz;

import com.chinadovey.power.webapps.biz.base.BaseBiz;
import com.chinadovey.power.webapps.pojo.CdmeterCacheData;

public interface CdmeterCacheBiz extends BaseBiz<CdmeterCacheData>{

	/**
	 * 进行 数据统计的时候 会保存最后一条（按照时间正序）记录
	 * 查询 缓存的数据
	 * @param type：1:表示单相表 2;表示三相表   
	 * @return
	 */
	CdmeterCacheData getCacheData(Integer type);

	
}

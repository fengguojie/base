package com.chinadovey.power.webapps.mappers.gen;

import com.chinadovey.power.webapps.mappers.base.BaseMapper;
import com.chinadovey.power.webapps.pojo.PowerCdmeterdataRealtimeSingle;
import com.chinadovey.power.webapps.pojo.PowerCdmeterdataRealtimeSingleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PowerCdmeterdataRealtimeSingleMapper extends BaseMapper<PowerCdmeterdataRealtimeSingle>{
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_realtime_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    int countByExample(PowerCdmeterdataRealtimeSingleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_realtime_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    int deleteByExample(PowerCdmeterdataRealtimeSingleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_realtime_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_realtime_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    int insert(PowerCdmeterdataRealtimeSingle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_realtime_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    int insertSelective(PowerCdmeterdataRealtimeSingle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_realtime_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    List<PowerCdmeterdataRealtimeSingle> selectByExample(PowerCdmeterdataRealtimeSingleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_realtime_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    PowerCdmeterdataRealtimeSingle selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_realtime_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    int updateByExampleSelective(@Param("record") PowerCdmeterdataRealtimeSingle record, @Param("example") PowerCdmeterdataRealtimeSingleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_realtime_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    int updateByExample(@Param("record") PowerCdmeterdataRealtimeSingle record, @Param("example") PowerCdmeterdataRealtimeSingleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_realtime_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    int updateByPrimaryKeySelective(PowerCdmeterdataRealtimeSingle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_realtime_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    int updateByPrimaryKey(PowerCdmeterdataRealtimeSingle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_realtime_s
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    List<PowerCdmeterdataRealtimeSingle> selectByExample(PowerCdmeterdataRealtimeSingleExample example, RowBounds rowBounds);
}
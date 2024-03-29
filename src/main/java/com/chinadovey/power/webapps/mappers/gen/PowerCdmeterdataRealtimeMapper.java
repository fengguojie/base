package com.chinadovey.power.webapps.mappers.gen;

import com.chinadovey.power.webapps.mappers.base.BaseMapper;
import com.chinadovey.power.webapps.pojo.PowerCdmeterdataRealtime;
import com.chinadovey.power.webapps.pojo.PowerCdmeterdataRealtimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PowerCdmeterdataRealtimeMapper extends BaseMapper<PowerCdmeterdataRealtime>{
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_realtime
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    int countByExample(PowerCdmeterdataRealtimeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_realtime
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    int deleteByExample(PowerCdmeterdataRealtimeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_realtime
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_realtime
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    int insert(PowerCdmeterdataRealtime record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_realtime
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    int insertSelective(PowerCdmeterdataRealtime record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_realtime
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    List<PowerCdmeterdataRealtime> selectByExample(PowerCdmeterdataRealtimeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_realtime
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    PowerCdmeterdataRealtime selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_realtime
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    int updateByExampleSelective(@Param("record") PowerCdmeterdataRealtime record, @Param("example") PowerCdmeterdataRealtimeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_realtime
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    int updateByExample(@Param("record") PowerCdmeterdataRealtime record, @Param("example") PowerCdmeterdataRealtimeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_realtime
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    int updateByPrimaryKeySelective(PowerCdmeterdataRealtime record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_realtime
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    int updateByPrimaryKey(PowerCdmeterdataRealtime record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table power_cdmeterdata_realtime
     *
     * @mbggenerated Mon Oct 31 17:56:21 CST 2016
     */
    List<PowerCdmeterdataRealtime> selectByExample(PowerCdmeterdataRealtimeExample example, RowBounds rowBounds);
}
package com.zyd.sop.biz.sz.apiservice.mapper;

import com.zyd.sop.biz.sz.apiservice.model.WqAwqmdD;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自动站监测数据 数据层
 * 
 * @author zmy
 * @date 2019-07-09
 */
//@DataSource("slave1") //从库1
public interface WqAwqmdDMapper
{
	/**
	 * 查询自动站单站多指标监测数据
	 *
	 * @return 自动站监测数据集合
	 */
	public List<WqAwqmdD> selectWqAwqmdDListByStcd(@Param("searchStcd") String searchStcd, @Param("searchItemCloumn") String searchItemCloumn, @Param("beginDate") String searchDate, @Param("endDate") String endDate);


}

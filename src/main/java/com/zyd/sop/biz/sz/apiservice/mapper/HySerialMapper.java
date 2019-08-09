package com.zyd.sop.biz.sz.apiservice.mapper;

/**
 * 实时库水文数据 数据层
 *
 * @author zmy
 * @date 2019-07-09
 */
//@DataSource("slave1") //从库1
public interface HySerialMapper {

    /**
     * 查询站点最新水文数据  系统时间8点区分日雨量
     *
     * @return 水文数据集合
     */

    /**
     * 查询站点5分钟水位数据 （最大时间跨度7day）
     *
     * @return 水文数据集合
     */

    /**
     * 查询站点5分钟雨量数据 （最大时间跨度7day）
     *
     * @return 水文数据集合
     */

    /**
     * 查询站点整点小时水位数据+最新水位（最大时间跨度31day）
     *
     * @return 水文数据集合
     */

    /**
     * 查询站点日8点水位数据+最新水位（最大时间跨度365day）
     *
     * @return 水文数据集合
     */

    /**
     * 查询站点日小时雨量数据（最大时间跨度7day）
     *
     * @return 水文数据集合
     */

    /**
     * 查询站点日雨量数据（最大时间跨度31day）
     *
     * @return 水文数据集合
     */

    /**
     * 整点小时流量数据（最大时间跨度31day）
     *
     * @return 水文数据集合
     */

}

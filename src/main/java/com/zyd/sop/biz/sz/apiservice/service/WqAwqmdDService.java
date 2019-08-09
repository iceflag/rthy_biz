package com.zyd.sop.biz.sz.apiservice.service;

import com.zyd.sop.biz.sz.apiservice.model.WqAwqmdD;

import javax.jws.WebParam;
import java.util.List;

/**
 * 自动站实时水质
 * @author zmy
 * @date 2019-07-05
 */
public interface WqAwqmdDService {
    //自动站监测
    List<WqAwqmdD> awqmd(@WebParam(name = "searchDate") String searchDate);
}

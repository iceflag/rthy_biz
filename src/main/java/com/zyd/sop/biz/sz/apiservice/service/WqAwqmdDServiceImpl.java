package com.zyd.sop.biz.sz.apiservice.service;

import com.zyd.sop.biz.sz.apiservice.mapper.WqAwqmdDMapper;
import com.zyd.sop.biz.sz.apiservice.model.WqAwqmdD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WqAwqmdDServiceImpl implements WqAwqmdDService {

    @Autowired
    private WqAwqmdDMapper wqAwqmdDMapper;

    @Override
    public List<WqAwqmdD> awqmd( String searchDate ) {
        List<WqAwqmdD> result = new ArrayList<WqAwqmdD>();
        try {
            //TODO 查询数据库相关数据
            String searchStcd = "63202911";
            //String searchColum = "WT,PH,COND,TURB,DOX,CODMN,CODCR,TN,NH3N,NO2,NO3,TP,TOC,CHLA,REDOX,CR6,PB,FE,MN,CN";
            String searchColum = "WT,PH,COND,TURB,DOX,CODMN";
            String beginDate = "2019-01-01";
            String endDate = "2019-06-30";
            result = wqAwqmdDMapper.selectWqAwqmdDListByStcd(searchStcd, searchColum, beginDate, endDate);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //UserUtils.clearAllUserInfo();
        } return result;
    }
}

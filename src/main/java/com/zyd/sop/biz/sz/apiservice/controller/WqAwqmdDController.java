package com.zyd.sop.biz.sz.apiservice.controller;

import com.zyd.sop.biz.sz.apiservice.model.WqAwqmdD;
import com.zyd.sop.biz.sz.apiservice.service.WqAwqmdDServiceImpl;
import com.zyd.sop.biz.sz.common.BaseController;
import com.zyd.sop.biz.sz.common.Query;
import com.zyd.sop.biz.sz.common.TableData;
import com.zyd.sop.servercommon.annotation.ApiAbility;
import com.zyd.sop.servercommon.annotation.ApiMapping;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Api(tags = {"水质测试接口"}, description = "测试的")
@RestController
@RequestMapping(value = "wqawqmdd")
public class WqAwqmdDController extends BaseController {

    @Autowired
    private WqAwqmdDServiceImpl wqAwqmdDServiceImpl;

    @ResponseBody
    @ApiOperation("添加自动站数据")
    @ApiMapping(value = "add", method = RequestMethod.POST)
    public WqAwqmdD add(@RequestBody WqAwqmdD entity){
        //wqAwqmdDService.insert(entity);
        //
        return entity;
    }
    @ResponseBody
    @ApiOperation("添加自动站数据2")
    @ApiMapping(value = "add2", method = RequestMethod.GET)
    public WqAwqmdD add2(int id){
        //wqAwqmdDService.insert(entity);
        //
        return new WqAwqmdD();
    }

    // 测试参数绑定
    @ApiAbility
    @GetMapping("getStory3")
    @ApiOperation(value="获取分类信息22", notes = "演示表格树22")
    public WqAwqmdD getStory3(String id) {

        return   new WqAwqmdD();
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    @ApiAbility(version = "1.0")
    @ResponseBody
    @ApiOperation("获取指定ID数据")
    public WqAwqmdD get( int id){
        //单站多指标监测集合。包括：多水质指标数据、监测时间；每次请求最大可查询跨度31天数据。

        WqAwqmdD result=new WqAwqmdD();
       // WqAwqmdD result=wqAwqmdDService.selectById(id);
        return result;
    }

    @ApiAbility(version = "1.0")
    @RequestMapping(value = "update",method = RequestMethod.PUT)
    @ResponseBody
    @ApiOperation("更新指定ID数据")
    public WqAwqmdD update(@RequestBody WqAwqmdD entity){
       // baseBiz.updateSelectiveById(entity);
        return entity;
    }
    @ApiAbility(version = "1.0")
    @RequestMapping(value = "delete",method = RequestMethod.DELETE)
    @ResponseBody
    public int remove(@RequestParam int id){
       // baseBiz.deleteById(id);
        return id;
    }

    @ApiAbility(version = "1.0")
    @ApiOperation("查询所有数据")
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    @ResponseBody
    public List<WqAwqmdD> all(){
        List<WqAwqmdD> result=null;
        //List result= baseBiz.selectListAll();
         return result;
    }

    @RequestMapping(value = "/page",method = RequestMethod.GET)
    @ResponseBody
    @ApiAbility(version = "1.0")
    public TableData<WqAwqmdD> list(@RequestParam Map<String, Object> params){
        //查询列表数据
        TableData<WqAwqmdD> result=null;
        Query query = new Query(params);
        //result= baseBiz.selectByQuery(query);
        return result;
    }

}

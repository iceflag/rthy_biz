package com.zyd.sop.biz.sz.controller;


import com.zyd.sop.biz.sz.apiservice.model.WqAwqmdD;
import com.zyd.sop.biz.sz.domain.Story;
import com.zyd.sop.servercommon.annotation.ApiAbility;
import com.zyd.sop.servercommon.annotation.ApiMapping;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tanghc
 */
@ApiAbility // 放在这里，下面所有的接口都具备接口提供能力
@RestController
@RequestMapping("story2")
@Api(tags = "故事接口2")
public class StoryDemoController {

    @ApiMapping(value = "story.demo.get")
    @ApiOperation(value="获取分类信息", notes = "演示表格树")
    public Story getStory() {
        Story story = new Story();
        story.setId(1);
        story.setName("白雪公主");
        return story;
    }

    // 测试参数绑定
    @ApiMapping("getStory3")
    @ApiOperation(value="获取分类信息22", notes = "演示表格树22")
    public WqAwqmdD getStory3(String id) {
        WqAwqmdD test=new WqAwqmdD();
        test.setCHLA("drdd");
        return  test ;
    }

}

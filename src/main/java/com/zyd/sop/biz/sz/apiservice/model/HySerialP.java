package com.zyd.sop.biz.sz.apiservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 站点时间序列雨量数据
 *
 * @author zmy
 * @date 2019-07-09
 */
public class HySerialP {

    /** 测站代码 */
    private String sTCD;
    /** 测站名称 */
    private String sTNM;
    /** 时间 */
    private String tM;
    /** 雨量 */
    private String p;

    @JsonProperty("sTCD")
    public String getSTCD() {
        return sTCD;
    }
    public void setSTCD( String sTCD ) {
        this.sTCD = sTCD;
    }
    @JsonProperty("sTNM")
    public String getSTNM() {
        return sTNM;
    }
    public void setSTNM( String sTNM ) {
        this.sTNM = sTNM;
    }
    @JsonProperty("tM")
    public String getTM() {
        return tM;
    }
    public void setTM( String tM ) {
        this.tM = tM;
    }
    @JsonProperty("p")
    public String getP() {
        return p;
    }
    public void setP( String p ) {
        this.p = p;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("sTCD", getSTCD())
                .append("sTNM", getSTNM())
                .append("tM", getTM())
                .append("z", getP())
                .toString();
    }
}

package com.zyd.sop.biz.sz.apiservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 站点最新水文数据
 *
 * @author zmy
 * @date 2019-07-09
 */
public class HyLatestD {

    /** 测站代码 */
    private String sTCD;
    /** 测站名称 */
    private String sTNM;
    /** 时间 */
    private String tM;
    /** 水位 */
    private String z;
    /** 流量 */
    private String q;
    /** 日雨量 */
    private String dRP;
    /** 风速 */
    private String wNDV;
    /** 风力 */
    private String wNDPWR;
    /** 风向 */
    private String wNDDIR;
    /** 浪高 */
    private String wVHGT;

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
    @JsonProperty("z")
    public String getZ() {
        return z;
    }
    public void setZ( String z ) {
        this.z = z;
    }
    @JsonProperty("q")
    public String getQ() {
        return q;
    }
    public void setQ( String q ) {
        this.q = q;
    }
    @JsonProperty("dRP")
    public String getDRP() {
        return dRP;
    }
    public void setDRP( String dRP ) {
        this.dRP = dRP;
    }
    @JsonProperty("wNDV")
    public String getWNDV() {
        return wNDV;
    }
    public void setWNDV( String wNDV ) {
        this.wNDV = wNDV;
    }
    @JsonProperty("wNDPWR")
    public String getWNDPWR() {
        return wNDPWR;
    }
    public void setWNDPWR( String wNDPWR ) {
        this.wNDPWR = wNDPWR;
    }
    @JsonProperty("wNNDIR")
    public String getWNDDIR() {
        return wNDDIR;
    }

    public void setWNDDIR( String wNDDIR ) {
        this.wNDDIR = wNDDIR;
    }
    @JsonProperty("wVHGT")
    public String getWVHGT() {
        return wVHGT;
    }
    public void setWVHGT( String wVHGT ) {
        this.wVHGT = wVHGT;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("sTCD", getSTCD())
                .append("sTNM", getSTNM())
                .append("tM", getTM())
                .append("z", getZ())
                .append("q", getQ())
                .append("dRP", getDRP())
                .append("wNDV", getWNDV())
                .append("wNDPWR", getWNDPWR())
                .append("wNDDIR", getWNDDIR())
                .append("wVHGT", getWVHGT())
                .toString();
    }
}

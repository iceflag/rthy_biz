package com.zyd.sop.biz.sz.apiservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 水质自动站监测实时数据表 WQ_AWQMD_D
 * 
 * @author zmy
 * @date 2019-07-04
 */
public class WqAwqmdD
{
	/** 测站代码 */
	private String sTCD;
	/** 测站名称 */
	private String sTNM;
	/** 采样时间 */
	private String sPT;
	/** 水温 */
	private String wT;
	/** pH值 */
	private String pH;
	/** 电导率(μS/cm) */
	private String cOND;
	/** 浊度 */
	private String tURB;
	/** 溶解氧(mg/L) */
	private String dOX;
	/** 高锰酸盐指数(mg/L) */
	private String cODMN;
	/** 化学需氧量(mg/L) */
	private String cODCR;
	/** 总氮(mg/L) */
	private String tN;
	/** 氨氮(mg/L) */
	private String nH3N;
	/** 亚硝酸盐氮(mg/L) */
	private String nO2;
	/** 硝酸盐氮(mg/L) */
	private String nO3;
	/** 总磷(mg/L) */
	private String tP;
	/** 总有机碳mg/L */
	private String tOC;
	/** 叶绿素a(mg/L) */
	private String cHLA;
	/** 氧化还原电位mv */
	private String rEDOX;
	/** 六价铬(mg/L) */
	private String cR6;
	/** 铅(mg/L) */
	private String pB;
	/** 铁(mg/L) */
	private String fE;
	/** 锰(mg/L) */
	private String mN;
	/** 氰化物(mg/L) */
	private String cN;

	public void setSTCD(String sTCD) 
	{
		this.sTCD = sTCD;
	}
    @JsonProperty("sTCD")
	public String getSTCD() 
	{
		return sTCD;
	}
	public void setSPT(String sPT)
	{
		this.sPT = sPT;
	}
	public void setSTNM(String sTNM)
	{
		this.sTNM = sTNM;
	}
	@JsonProperty("sTNM")
	public String getSTNM()
	{
		return sTNM;
	}
    @JsonProperty("sPT")
	public String getSPT()
	{
		return sPT;
	}
	public void setWT(String wT) 
	{
		this.wT = wT;
	}
    @JsonProperty("wT")
	public String getWT() 
	{
		return wT;
	}
	public void setPH(String pH) 
	{
		this.pH = pH;
	}
    @JsonProperty("pH")
	public String getPH() 
	{
		return pH;
	}
	public void setCOND(String cOND)
	{
		this.cOND = cOND;
	}
	@JsonProperty("cOND")
	public String getCOND()
	{
		return cOND;
	}
	public void setTURB(String tURB)
	{
		this.tURB = tURB;
	}
	@JsonProperty("tURB")
	public String getTURB()
	{
		return tURB;
	}
	public void setDOX(String dOX)
	{
		this.dOX = dOX;
	}
    @JsonProperty("dOX")
	public String getDOX() 
	{
		return dOX;
	}
	public void setCODMN(String cODMN) 
	{
		this.cODMN = cODMN;
	}
    @JsonProperty("cODMN")
	public String getCODMN() 
	{
		return cODMN;
	}
	public void setCODCR(String cODCR) 
	{
		this.cODCR = cODCR;
	}
    @JsonProperty("cODCR")
	public String getCODCR() 
	{
		return cODCR;
	}
	public void setTN(String tN)
	{
		this.tN = tN;
	}
	@JsonProperty("tN")
	public String getTN()
	{
		return tN;
	}
	public void setNH3N(String nH3N) 
	{
		this.nH3N = nH3N;
	}
    @JsonProperty("nH3N")
	public String getNH3N() 
	{
		return nH3N;
	}
	public void setNO2(String nO2)
	{
		this.nO2 = nO2;
	}
	@JsonProperty("nO2")
	public String getNO2()
	{
		return nO2;
	}
	public void setNO3(String nO3)
	{
		this.nO3 = nO3;
	}
	@JsonProperty("nO3")
	public String getNO3()
	{
		return nO3;
	}
	public void setTP(String tP)
	{
		this.tP = tP;
	}
	@JsonProperty("tP")
	public String getTP() 
	{
		return tP;
	}
	public void setTOC() { this.tOC = tOC; }
	@JsonProperty("tOC")
	public String getTOC() { return tOC; }
	public void setCHLA(String cHLA)
	{
		this.cHLA = cHLA;
	}
	@JsonProperty("cHLA")
	public String getCHLA()
	{
		return cHLA;
	}
	public void setREDOX() { this.rEDOX = rEDOX; }
	@JsonProperty("rEDOX")
	public String getREDOX() {
		return rEDOX;
	}
	public void setCR6( String cR6)
	{
		this.cR6 = cR6;
	}
	@JsonProperty("cR6")
	public String getCR6() 
	{
		return cR6;
	}
	public void setPB(String pB)
	{
		this.pB = pB;
	}
	@JsonProperty("pB")
	public String getPB() 
	{
		return pB;
	}
	public void setFE(String fE)
	{
		this.fE = fE;
	}
	@JsonProperty("fE")
	public String getFE()
	{
		return fE;
	}
	public void setMN(String mN)
	{
		this.mN = mN;
	}
	@JsonProperty("mN")
	public String getMN()
	{
		return mN;
	}
	public void setCN(String cN)
	{
		this.cN = cN;
	}
	@JsonProperty("cN")
	public String getCN()
	{
		return cN;
	}


    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("sTCD", getSTCD())
			.append("sTNM", getSTNM())
            .append("sPT", getSPT())
            .append("wT", getWT())
            .append("pH", getPH())
			.append("cOND", getCOND())
			.append("tURB", getTURB())
            .append("dOX", getDOX())
            .append("cODMN", getCODMN())
            .append("cODCR", getCODCR())
            .append("tN", getTN())
			.append("nH3N", getNH3N())
			.append("nO2", getNO2())
			.append("nO3", getNO3())
			.append("tP", getTP())
			.append("tOC", getTOC())
			.append("cHLA", getCHLA())
			.append("rEDOX", getREDOX())
			.append("cR6", getCR6())
            .append("pB", getPB())
            .append("fE", getFE())
            .append("mN", getMN())
			.append("cN", getCN())
            .toString();
    }
}

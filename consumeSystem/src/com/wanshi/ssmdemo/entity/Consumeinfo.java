package com.wanshi.ssmdemo.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Consumeinfo {
    private Integer consumeid;

    private String consumename;

    private BigDecimal consumeprice;

    private Integer consumecount;

    private Date consumedate;

    private Integer consumetype;

    private String remark;

    public Integer getConsumeid() {
        return consumeid;
    }

    public void setConsumeid(Integer consumeid) {
        this.consumeid = consumeid;
    }

    public String getConsumename() {
        return consumename;
    }

    public void setConsumename(String consumename) {
        this.consumename = consumename == null ? null : consumename.trim();
    }

    public BigDecimal getConsumeprice() {
		return consumeprice;
	}

	public void setConsumeprice(BigDecimal consumeprice) {
		this.consumeprice = consumeprice;
	}

	public Integer getConsumecount() {
        return consumecount;
    }

    public void setConsumecount(Integer consumecount) {
        this.consumecount = consumecount;
    }

    public Date getConsumedate() {
        return consumedate;
    }

    public void setConsumedate(Date consumedate) {
        this.consumedate = consumedate;
    }

    public Integer getConsumetype() {
        return consumetype;
    }

    public void setConsumetype(Integer consumetype) {
        this.consumetype = consumetype;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
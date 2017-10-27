package com.zooweb.modle.entities.order;

import com.zooweb.modle.dto.BaseEntity;
import java.math.BigDecimal;

public class ClrCollection extends BaseEntity {
    /**
	 * 
	 */
	private static final long serialVersionUID = -1091942572990612993L;

	private String id;

    private Integer tnm;

    private Integer clm;

    private Short prd;

    private String comBla;

    private String comBld;

    private String comName;

    private String comType;

    private String customType;

    private String payType;

    private String factCurrency;

    private BigDecimal factMoney;

    private Integer collectDate;

    private String payer;

    private BigDecimal reviMoney;

    private String checkStatus;

    private String createId;

    private String createDate;

    private String createTime;

    private String updateId;

    private String updateDate;

    private String updateTime;

    private String transferDate;

    private String reviReceSrc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getTnm() {
        return tnm;
    }

    public void setTnm(Integer tnm) {
        this.tnm = tnm;
    }

    public Integer getClm() {
        return clm;
    }

    public void setClm(Integer clm) {
        this.clm = clm;
    }

    public Short getPrd() {
        return prd;
    }

    public void setPrd(Short prd) {
        this.prd = prd;
    }

    public String getComBla() {
        return comBla;
    }

    public void setComBla(String comBla) {
        this.comBla = comBla;
    }

    public String getComBld() {
        return comBld;
    }

    public void setComBld(String comBld) {
        this.comBld = comBld;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getComType() {
        return comType;
    }

    public void setComType(String comType) {
        this.comType = comType;
    }

    public String getCustomType() {
        return customType;
    }

    public void setCustomType(String customType) {
        this.customType = customType;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getFactCurrency() {
        return factCurrency;
    }

    public void setFactCurrency(String factCurrency) {
        this.factCurrency = factCurrency;
    }

    public BigDecimal getFactMoney() {
        return factMoney;
    }

    public void setFactMoney(BigDecimal factMoney) {
        this.factMoney = factMoney;
    }

    public Integer getCollectDate() {
        return collectDate;
    }

    public void setCollectDate(Integer collectDate) {
        this.collectDate = collectDate;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public BigDecimal getReviMoney() {
        return reviMoney;
    }

    public void setReviMoney(BigDecimal reviMoney) {
        this.reviMoney = reviMoney;
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(String transferDate) {
        this.transferDate = transferDate;
    }

    public String getReviReceSrc() {
        return reviReceSrc;
    }

    public void setReviReceSrc(String reviReceSrc) {
        this.reviReceSrc = reviReceSrc;
    }
}
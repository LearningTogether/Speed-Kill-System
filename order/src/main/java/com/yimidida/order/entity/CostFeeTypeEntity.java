package com.yimidida.order.entity;

import java.io.Serializable;
import java.util.Date;

public class CostFeeTypeEntity implements Serializable{

	  /**
     *ID
     */
    private Long feeTypeId;

    /**
     *费用编码（自动生成）
     */
    private String feeType;

    /**
     *费用名称
     */
    private String feeName;

    /**
     *系统级别:1,系统级别2,应用级别(从结算添加的时候默认是应用级别)
     */
    private Integer systemLevel;

    /**
     *是否市场价,1,是,2否
     */
    private Integer isMarketFlag;

    /**
     *成本类别：1—平台成本 2—始发端成本 3—末端成本
     */
    private Integer costType;

    /**
     *1—运费底价 2—增值费底价 3—干线费底价
     */
    private Integer feeCostMode;

    /**
     *运单增值服务类型
     */
    private String serviceTypeCode;

    /**
     *一级网点抽水：0——不允许 1——允许
     */
    private Integer deptResetFlag;

    /**
     *省区总部抽水：0——不允许 1——允许
     */
    private Integer hqResetFlag;

    /**
     *一级网点加收：0——不允许 1——允许
     */
    private Integer deptAddFlag;

    /**
     *省区总部加收：0——不允许 1——允许
     */
    private Integer hqAddFlag;

    /**
     *备注信息
     */
    private String remark;

    /**
     *锁版本号
     */
    private Long recordVersion;

    /**
     *是否删除 1：未删除；2： 已删除
     */
    private Integer isDelete;

    /**
     *创建人
     */
    private String creater;

    /**
     *创建日期
     */
    private Date createrTime;

    private String modifier;

    /**
     *修改日期
     */
   
   
    private Date modifierTime;

    private String column1;

  
    private String column2;

   
    private String column3;

    /**
     *是否整车:0-否,1-是
     */
   
    private Integer isWholeVehicleFlag;

    private static final long serialVersionUID = 1L;

    public Long getFeeTypeId() {
        return feeTypeId;
    }

    public void setFeeTypeId(Long feeTypeId) {
        this.feeTypeId = feeTypeId;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getFeeName() {
        return feeName;
    }

    public void setFeeName(String feeName) {
        this.feeName = feeName;
    }

    public Integer getSystemLevel() {
        return systemLevel;
    }

    public void setSystemLevel(Integer systemLevel) {
        this.systemLevel = systemLevel;
    }

    public Integer getIsMarketFlag() {
        return isMarketFlag;
    }

    public void setIsMarketFlag(Integer isMarketFlag) {
        this.isMarketFlag = isMarketFlag;
    }

    public Integer getCostType() {
        return costType;
    }

    public void setCostType(Integer costType) {
        this.costType = costType;
    }

    public Integer getFeeCostMode() {
        return feeCostMode;
    }

    public void setFeeCostMode(Integer feeCostMode) {
        this.feeCostMode = feeCostMode;
    }

    public String getServiceTypeCode() {
        return serviceTypeCode;
    }

    public void setServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }

    public Integer getDeptResetFlag() {
        return deptResetFlag;
    }

    public void setDeptResetFlag(Integer deptResetFlag) {
        this.deptResetFlag = deptResetFlag;
    }

    public Integer getHqResetFlag() {
        return hqResetFlag;
    }

    public void setHqResetFlag(Integer hqResetFlag) {
        this.hqResetFlag = hqResetFlag;
    }

    public Integer getDeptAddFlag() {
        return deptAddFlag;
    }

    public void setDeptAddFlag(Integer deptAddFlag) {
        this.deptAddFlag = deptAddFlag;
    }

    public Integer getHqAddFlag() {
        return hqAddFlag;
    }

    public void setHqAddFlag(Integer hqAddFlag) {
        this.hqAddFlag = hqAddFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getRecordVersion() {
        return recordVersion;
    }

    public void setRecordVersion(Long recordVersion) {
        this.recordVersion = recordVersion;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getCreaterTime() {
        return createrTime;
    }

    public void setCreaterTime(Date createrTime) {
        this.createrTime = createrTime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Date getModifierTime() {
        return modifierTime;
    }

    public void setModifierTime(Date modifierTime) {
        this.modifierTime = modifierTime;
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    public String getColumn3() {
        return column3;
    }

    public void setColumn3(String column3) {
        this.column3 = column3;
    }

    public Integer getIsWholeVehicleFlag() {
        return isWholeVehicleFlag;
    }

    public void setIsWholeVehicleFlag(Integer isWholeVehicleFlag) {
        this.isWholeVehicleFlag = isWholeVehicleFlag;
    }
}

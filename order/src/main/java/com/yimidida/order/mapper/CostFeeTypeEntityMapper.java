package com.yimidida.order.mapper;

import com.yimidida.order.entity.CostFeeTypeEntity;

public interface CostFeeTypeEntityMapper {

	public CostFeeTypeEntity selectByPrimaryKey(Long Id);

	public void deleteByPrimaryKey(Long Id);

	public void insertSelective(CostFeeTypeEntity entity);
}

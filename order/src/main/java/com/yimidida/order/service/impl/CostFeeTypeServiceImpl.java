package com.yimidida.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yimidida.order.entity.CostFeeTypeEntity;
import com.yimidida.order.mapper.CostFeeTypeEntityMapper;
import com.yimidida.order.service.CostFeeTypeService;

@Service
public class CostFeeTypeServiceImpl  implements CostFeeTypeService{
	
	@Autowired	
	private CostFeeTypeEntityMapper costFeeTypeEntityMapper;

	@Override
	public CostFeeTypeEntity findById(Long id) {
		return costFeeTypeEntityMapper.selectByPrimaryKey(id);
		
	}
	

}

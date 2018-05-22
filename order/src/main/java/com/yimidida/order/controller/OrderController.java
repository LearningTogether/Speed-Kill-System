package com.yimidida.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yimidida.order.common.CostFeeRedisServiceImpl;
import com.yimidida.order.entity.CostFeeTypeEntity;
import com.yimidida.order.service.CostFeeTypeService;
import com.yimidida.order.service.SkuTokenService;

@RestController
@RequestMapping("order")
public class OrderController {
	@Autowired
	private CostFeeTypeService costFeeTypeService;

	@Autowired
	private CostFeeRedisServiceImpl costFeeRedisServiceImpl;

	@Autowired
	private SkuTokenService skuTokenService;

	@RequestMapping("queryById")
	public CostFeeTypeEntity getOrderById() {
		CostFeeTypeEntity feeType = costFeeTypeService.findById(6286000000000000002l);
		return feeType;

	}

	@RequestMapping("queryByIdFromRedis")
	public CostFeeTypeEntity queryByIdFromRedis() {
		CostFeeTypeEntity feeType = costFeeTypeService.findById(6286000000000000002l);
		costFeeRedisServiceImpl.put(feeType.getFeeType(), feeType, 60 * 60 * 1000);
		return costFeeRedisServiceImpl.get(feeType.getFeeType());

	}

	@RequestMapping("getSkuToken")
	public String getTiketToken(Long skuId) {
		String grabSkuToken = skuTokenService.grabSkuToken(skuId);
		if (grabSkuToken == null) {
			throw new RuntimeException();
		}
		return grabSkuToken;
	}

	@RequestMapping("initSkuNum")
	public String initSkuNum(Long skuId, Integer num) {
		skuTokenService.initSkuNmu(skuId, num);
		return "init SkuNum success";
	}
	
	@RequestMapping("showNumber")
	public String showNumber(Long skuId) {
		String number = skuTokenService.showNumber(skuId);
		return  number + " People had Rush to buy";
	}
	
	@RequestMapping("initNumber")
	public String initnNumber(Long skuId) {
		skuTokenService.initStatisticalNumber(skuId);
		return  "init skuId "+skuId+" success";
	}
	
	
}

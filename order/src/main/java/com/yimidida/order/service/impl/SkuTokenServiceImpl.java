package com.yimidida.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yimidida.order.common.IRedisForStringService;
import com.yimidida.order.service.SkuTokenService;

@Service
public class SkuTokenServiceImpl implements SkuTokenService {
	
	public static String TOKENKEY="TOKEN_KEY";
	
	public static String RECOUNT="REQUEST_COUNT";

	@Autowired
	private IRedisForStringService iRedisForStringService;

	@Override
	public void initSkuNmu(Long skuId, Integer num) {
		iRedisForStringService.put(TOKENKEY + skuId.toString(), num.toString());

	}

	@Override
	public String grabSkuToken(Long skuId) {
		StatisticalNumber(skuId);

		Long i = iRedisForStringService.decrement(TOKENKEY + skuId.toString());

		if (i > -1) {
			return TOKENKEY + skuId + i;
		}
		return null;
	}

	@Override
	public void StatisticalNumber(Long skuId) {
		iRedisForStringService.increment(TOKENKEY + RECOUNT + skuId.toString());
	}

	@Override
	public String showNumber(Long skuId) {
		return iRedisForStringService.get(TOKENKEY + RECOUNT + skuId.toString());
	}

	@Override
	public void initStatisticalNumber(Long skuId) {
		iRedisForStringService.put(TOKENKEY + RECOUNT + skuId.toString(), "0");	
	}
	
	

}

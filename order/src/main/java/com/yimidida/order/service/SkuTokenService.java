package com.yimidida.order.service;

public interface SkuTokenService {
	
	
	public void initSkuNmu(Long skuId,Integer num);
	
	public String grabSkuToken(Long skuId);
	
	public void StatisticalNumber(Long skuId);
	
	public String showNumber(Long skuId);
	
	public void initStatisticalNumber(Long skuId);
	
}

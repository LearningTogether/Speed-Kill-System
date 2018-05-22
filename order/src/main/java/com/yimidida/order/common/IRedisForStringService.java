package com.yimidida.order.common;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

@Component
public class IRedisForStringService {

	@Autowired
	protected RedisTemplate<String, Object> redisTemplate;
	@Resource
	protected ValueOperations<String, String> valueOperations;

	/**
	 * 添加
	 *
	 * @param key
	 *            key
	 * @param value
	 *            值
	 */
	public void put(String key, String value) {
		valueOperations.set(key, value);
	}
	

	public void put(String key, String value, Long offset) {
		valueOperations.set(key, value, offset);
	}

	/**
	 * 查询
	 *
	 * @param key
	 * @return
	 */
	public String get(String key) {
		return valueOperations.get(key);
	}

	public Long decrement(String key) {
		return valueOperations.increment(key, -1);
	}
	
	public Long increment(String key) {
		return valueOperations.increment(key, 1);	  
	}
	
	

}

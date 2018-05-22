package com.yimidida.order.common;

import org.springframework.stereotype.Service;

import com.yimidida.order.entity.CostFeeTypeEntity;

/**
 * Created by Administrator on 2017/3/1 16:00.
 */
@Service
public class CostFeeRedisServiceImpl extends IRedisForObjectService<CostFeeTypeEntity> {
    private final String REDIS_KEY = "Redis_FeeType";

    @Override
    protected String getRedisKey() {
        return this.REDIS_KEY;
    }
    
    
}

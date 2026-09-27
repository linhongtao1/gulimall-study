package com.xunqi.gulimall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xunqi.gulimall.coupon.entity.CouponEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lht
 * @email HeJieLin@gulimall.com
 * @date 2023-05-22 19:35:30
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

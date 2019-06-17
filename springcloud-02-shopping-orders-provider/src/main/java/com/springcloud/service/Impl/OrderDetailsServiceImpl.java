package com.springcloud.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springcloud.common.PageUtils;
import com.springcloud.dao.OrderDetailsMapper;
import com.springcloud.entity.OrderDetails;
import com.springcloud.service.OrderDetailsService;

/**
 * 订单明细模块模型层的实现类，用于实现订单明细模块的方法
 * 
 * @author 张怡
 *
 */
@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

	@Autowired
	private OrderDetailsMapper orderDetailsMapper;

	@Override
	public PageInfo<OrderDetails> selectByOrderId(Integer orderId, Integer pageNumber) {

		// 设置分页信息
		PageHelper.startPage(pageNumber + 1, PageUtils.PAGE_ROW_COUNT);
		// 查询指定订单编号的订单明细信息
		List<OrderDetails> list = this.orderDetailsMapper.selectByOrderId(orderId);
		return new PageInfo<>(list);
	}

}
package com.musejam.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.musejam.app.constants.MusejamErrors;
import com.musejam.app.dto.AppError;
import com.musejam.app.dto.AppResult;
import com.musejam.app.dto.IResult;
import com.musejam.app.helper.DtoHelper;
import com.musejam.app.model.OrderItem;
import com.musejam.app.model.Orders;
import com.musejam.app.repository.OrderItemRepository;
import com.musejam.app.repository.OrdersRepository;
import com.musejam.app.utils.StringUtils;
import com.musejam.app.utils.Utils;

@RestController
public class OrdersController {

	@Autowired
	private OrdersRepository ordersRepository;
	@Autowired
	private DtoHelper dtoHelper;

	@RequestMapping(value = "/orders", method = RequestMethod.POST)
	@ResponseBody
	public IResult createOrdersItem(@RequestBody Orders orders) {
		AppResult appResult = new AppResult();
		try {
			ordersRepository.save(orders);
			appResult.setResult(ordersRepository.findOne(orders.getId()));
		} catch (Exception e) {
			Utils.setException(e, new AppError(
					StringUtils.isNull(e.getMessage()) ? MusejamErrors.Exception.getDescription() : e.getMessage(),
					MusejamErrors.Exception.getCode()), appResult);
		} finally {
			return appResult;
		}

	}
	
	@RequestMapping(value = "/orders", method = RequestMethod.PUT)
	@ResponseBody
	public IResult updateOrdersItem(@RequestBody Orders orders) {
		AppResult appResult = new AppResult();
		try {
			ordersRepository.save(orders);
			appResult.setResult(ordersRepository.findOne(orders.getId()));
		} catch (Exception e) {
			Utils.setException(e, new AppError(
					StringUtils.isNull(e.getMessage()) ? MusejamErrors.Exception.getDescription() : e.getMessage(),
					MusejamErrors.Exception.getCode()), appResult);
		} finally {
			return appResult;
		}

	}
	
	@RequestMapping(value = "/orders", method = RequestMethod.GET)
	@ResponseBody
	public IResult allOrdersItem() {
		AppResult appResult = new AppResult();
		try {
			appResult.setResult(ordersRepository.findAll());
		} catch (Exception e) {
			Utils.setException(e, new AppError(
					StringUtils.isNull(e.getMessage()) ? MusejamErrors.Exception.getDescription() : e.getMessage(),
					MusejamErrors.Exception.getCode()), appResult);
		} finally {
			return appResult;
		}

	}
}

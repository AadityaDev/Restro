package com.musejam.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.musejam.app.constants.MusejamErrors;
import com.musejam.app.dto.AppError;
import com.musejam.app.dto.AppResult;
import com.musejam.app.dto.IResult;
import com.musejam.app.dto.OrderItemDto;
import com.musejam.app.dto.UserDto;
import com.musejam.app.helper.DtoHelper;
import com.musejam.app.model.OrderItem;
import com.musejam.app.repository.OrderItemRepository;
import com.musejam.app.utils.StringUtils;
import com.musejam.app.utils.Utils;

public class OrdersItemController {

	@Autowired
	private OrderItemRepository ordersItemRepository;
	@Autowired
	private DtoHelper dtoHelper;

	@RequestMapping(value = "/ordersitem", method = RequestMethod.POST)
	@ResponseBody
	public IResult createOrdersItem(@RequestBody OrderItem orderItem) {
		AppResult appResult = new AppResult();
		try {
			ordersItemRepository.save(orderItem);
			appResult.setResult(ordersItemRepository.findOne(orderItem.getId()));
		} catch (Exception e) {
			Utils.setException(e, new AppError(
					StringUtils.isNull(e.getMessage()) ? MusejamErrors.Exception.getDescription() : e.getMessage(),
					MusejamErrors.Exception.getCode()), appResult);
		} finally {
			return appResult;
		}

	}
	
	@RequestMapping(value = "/ordersitem", method = RequestMethod.PUT)
	@ResponseBody
	public IResult updateOrdersItem(@RequestBody OrderItem orderItem) {
		AppResult appResult = new AppResult();
		try {
			ordersItemRepository.save(orderItem);
			appResult.setResult(ordersItemRepository.findOne(orderItem.getId()));
		} catch (Exception e) {
			Utils.setException(e, new AppError(
					StringUtils.isNull(e.getMessage()) ? MusejamErrors.Exception.getDescription() : e.getMessage(),
					MusejamErrors.Exception.getCode()), appResult);
		} finally {
			return appResult;
		}

	}
	
	@RequestMapping(value = "/ordersitem", method = RequestMethod.GET)
	@ResponseBody
	public IResult allOrdersItem() {
		AppResult appResult = new AppResult();
		try {
			appResult.setResult(ordersItemRepository.findAll());
		} catch (Exception e) {
			Utils.setException(e, new AppError(
					StringUtils.isNull(e.getMessage()) ? MusejamErrors.Exception.getDescription() : e.getMessage(),
					MusejamErrors.Exception.getCode()), appResult);
		} finally {
			return appResult;
		}

	}

}

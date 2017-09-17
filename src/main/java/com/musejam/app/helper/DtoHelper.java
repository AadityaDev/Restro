package com.musejam.app.helper;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

import com.musejam.app.dto.AddOnItemDto;
import com.musejam.app.dto.AppResult;
import com.musejam.app.dto.OrderDto;
import com.musejam.app.dto.OrderItemDto;
import com.musejam.app.dto.UserDto;
import com.musejam.app.model.AddOnItem;
import com.musejam.app.model.Orders;
import com.musejam.app.model.OrderItem;
import com.musejam.app.model.User;

@Component
@EnableAsync
public class DtoHelper {

	public OrderDto fillOrderDto(@NotNull Orders order, @NotNull List<OrderItem> orderItems) {
		final List<OrderItemDto> orderItemDtos = new ArrayList<OrderItemDto>();
		orderItemDtos.addAll(fillOrderItemDtos(orderItems));
		final OrderDto orderDto = new OrderDto();
		orderDto.setId(order.getId());
		orderDto.setItems(orderItemDtos);
		orderDto.setTotalItems(order.getTotalItems());
		orderDto.setTotalDicount(order.getTotalDicount());
		orderDto.setDiscountAvaible(order.isDiscountAvaible());
		orderDto.setDicountPercentage(order.getDicountPercentage());
		return orderDto;
	}

	public OrderDto fillOrderDtoWithDiscount(@NotNull Orders order, @NotNull List<OrderItem> orderItems,
			@NotNull List<OrderItem> discountItems) {
		final List<OrderItemDto> orderItemDtos = new ArrayList<OrderItemDto>();
		orderItemDtos.addAll(fillOrderItemDtos(orderItems));
		final List<OrderItemDto> discountItemDtos = new ArrayList<OrderItemDto>();
		discountItemDtos.addAll(fillOrderItemDtos(discountItems));
		final OrderDto orderDto = new OrderDto();
		orderDto.setId(order.getId());
		orderDto.setItems(orderItemDtos);
		orderDto.setTotalItems(order.getTotalItems());
		orderDto.setTotalDicount(order.getTotalDicount());
		orderDto.setDiscountedItems(discountItemDtos);
		orderDto.setDiscountAvaible(order.isDiscountAvaible());
		orderDto.setDicountPercentage(order.getDicountPercentage());
		return orderDto;
	}

	public List<AddOnItemDto> fillAddOnItemDtoList(@NotNull List<AddOnItem> addOnItems) {
		List<AddOnItemDto> addOnItemDtos = new ArrayList<>();
		for (AddOnItem addOnItem : addOnItems) {
			AddOnItemDto addOnItemDto = new AddOnItemDto();
			addOnItemDto.setId(addOnItem.getId());
			addOnItemDto.setItemQuantity(addOnItem.getItemQuantity());
			addOnItemDto.setPrice(addOnItem.getPrice());
			addOnItemDto.setQuantity(addOnItem.getQuantity());
			addOnItemDtos.add(addOnItemDto);
		}
		return addOnItemDtos;
	}

	public AddOnItemDto fillAddOnItemDto(@NotNull AddOnItem addOnItem) {
		AddOnItemDto addOnItemDto = new AddOnItemDto();
		addOnItemDto.setId(addOnItem.getId());
		addOnItemDto.setItemQuantity(addOnItem.getItemQuantity());
		addOnItemDto.setPrice(addOnItem.getPrice());
		addOnItemDto.setQuantity(addOnItem.getQuantity());
		return addOnItemDto;
	}

	public List<OrderItemDto> fillOrderItemDtos(@NotNull List<OrderItem> orderItems) {
		List<OrderItemDto> orderItemDtos = new ArrayList<>();
		for (OrderItem orderItem : orderItems) {
			OrderItemDto orderItemDto = new OrderItemDto();
			orderItemDto.setId(orderItem.getId());
			orderItemDto.setName(orderItem.getName());
			orderItemDto.setPrice(orderItem.getPrice());
			orderItemDto.setItemQuantity(orderItem.getItemQuantity());
			orderItemDto.setQuantity(orderItem.getQuantity());
			orderItemDto.setDiscount(orderItem.getDiscount());
			orderItemDtos.add(orderItemDto);
		}
		return orderItemDtos;
	}
	
	public List<OrderItemDto> fillOrderItemDtosWithAddOn(@NotNull List<OrderItem> orderItems,@NotNull List<AddOnItem> addOnItems) {
		List<OrderItemDto> orderItemDtos = new ArrayList<>();
		for (OrderItem orderItem : orderItems) {
			OrderItemDto orderItemDto = new OrderItemDto();
			orderItemDto.setId(orderItem.getId());
			orderItemDto.setName(orderItem.getName());
			orderItemDto.setPrice(orderItem.getPrice());
			orderItemDto.setItemQuantity(orderItem.getItemQuantity());
			orderItemDto.setQuantity(orderItem.getQuantity());
			orderItemDto.setDiscount(orderItem.getDiscount());
			orderItemDto.setExtraItems(fillAddOnItemDtoList(addOnItems));
			orderItemDtos.add(orderItemDto);
		}
		return orderItemDtos;
	}

	public OrderItemDto fillOrderItemDto(@NotNull OrderItem orderItem) {
		OrderItemDto orderItemDto = new OrderItemDto();
		orderItemDto.setId(orderItem.getId());
		orderItemDto.setName(orderItem.getName());
		orderItemDto.setPrice(orderItem.getPrice());
		orderItemDto.setItemQuantity(orderItem.getItemQuantity());
		orderItemDto.setQuantity(orderItem.getQuantity());
		orderItemDto.setDiscount(orderItem.getDiscount());
		return orderItemDto;
	}

	public OrderItemDto fillOrderItemDtoWithAddOn(@NotNull OrderItem orderItem, @NotNull List<AddOnItem> addOnItems) {
		OrderItemDto orderItemDto = new OrderItemDto();
		orderItemDto.setId(orderItem.getId());
		orderItemDto.setName(orderItem.getName());
		orderItemDto.setPrice(orderItem.getPrice());
		orderItemDto.setItemQuantity(orderItem.getItemQuantity());
		orderItemDto.setQuantity(orderItem.getQuantity());
		orderItemDto.setDiscount(orderItem.getDiscount());
		orderItemDto.setExtraItems(fillAddOnItemDtoList(addOnItems));
		return orderItemDto;
	}
	
	public UserDto FillUserDto(@NotNull User user){
		UserDto userDto=new UserDto();
		userDto.setId(user.getId());
		userDto.setEmail(user.getEmail());
		userDto.setAuthToken(user.getAuthToken());
		userDto.setSex(user.getSex());
		return userDto;
	}
	

}

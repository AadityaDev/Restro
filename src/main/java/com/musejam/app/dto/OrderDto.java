package com.musejam.app.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class OrderDto implements Serializable {

	private long id;
	private List<OrderItemDto> items;
	private int totalItems;
	private double tax;
	private double totalAmount;
	private transient List<OrderItemDto> discountedItems;
	private transient double totalDicount;
	private transient double dicountPercentage;
	private boolean isDiscountAvaible;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<OrderItemDto> getItems() {
		return items;
	}

	public void setItems(List<OrderItemDto> items) {
		this.items = items;
	}

	public int getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<OrderItemDto> getDiscountedItems() {
		return discountedItems;
	}

	public void setDiscountedItems(List<OrderItemDto> discountedItems) {
		this.discountedItems = discountedItems;
	}

	public double getTotalDicount() {
		return totalDicount;
	}

	public void setTotalDicount(double totalDicount) {
		this.totalDicount = totalDicount;
	}

	public double getDicountPercentage() {
		return dicountPercentage;
	}

	public void setDicountPercentage(double dicountPercentage) {
		this.dicountPercentage = dicountPercentage;
	}

	public boolean isDiscountAvaible() {
		return isDiscountAvaible;
	}

	public void setDiscountAvaible(boolean isDiscountAvaible) {
		this.isDiscountAvaible = isDiscountAvaible;
	}

}

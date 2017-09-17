package com.musejam.app.dto;

public class AddOnItemDto {

	private long id;
	private Integer numOfItems;
	private String quantity;
	private transient double price;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Integer getItemQuantity() {
		return numOfItems;
	}
	public void setItemQuantity(Integer itemQuantity) {
		this.numOfItems = itemQuantity;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}

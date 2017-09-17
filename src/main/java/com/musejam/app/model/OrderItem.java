package com.musejam.app.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="order_item")
public class OrderItem {

	@Id
    @Column(name="order_item_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
    @Column(name="name")
	private String name;
    @Column(name="price")
	private Double price;
    @Column(name="item_quantity")
	private Integer itemQuantity;
    @Column(name="quantity")
	private String quantity;
    @Column(name="discount")
	private double discount;
    @Column(name="add_on_item_id")
	private long extraItem;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(Integer itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public long getExtraItems() {
		return extraItem;
	}

	public void setExtraItems(long extraItems) {
		this.extraItem = extraItems;
	}

}

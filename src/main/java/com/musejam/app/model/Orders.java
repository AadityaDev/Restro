package com.musejam.app.model;

import java.io.Serializable;
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
@Table(name="orders")
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "order_item_id")
	private long item_id;
	@Column(name = "total_items")
	private int totalItems;
	@Column(name = "tax")
	private double tax;
	@Column(name = "total_amount")
	private double totalAmount;
	@Column(name = "total_discount")
	private transient double totalDicount;
	@Column(name = "dicount_percentage")
	private transient double dicountPercentage;
	@Column(name = "is_discount_avaible")
	private boolean isDiscountAvaible;
	@Column(name = "user_id")
	private long userId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getItems() {
		return item_id;
	}

	public void setItems(long items) {
		this.item_id = items;
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

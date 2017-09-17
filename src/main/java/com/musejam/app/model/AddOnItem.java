package com.musejam.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "extra_items")
public class AddOnItem {

	@Id
	@Column(name = "add_on_item_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "num_of_items")
	private Integer numOfItems;
	@Column(name = "quantity")
	private String quantity;
	@Column(name = "price")
	private double price;
	@Column(name = "name")
	private String name;
	

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

	public Integer getNumOfItems() {
		return numOfItems;
	}

	public void setNumOfItems(Integer numOfItems) {
		this.numOfItems = numOfItems;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

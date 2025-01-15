package com.JspH2webMVC.entity;

import javax.persistence.*;

@Entity
public class product {

	@Id
	@GeneratedValue
	private Integer pid;
	
	private String name;
	
	private Double price;
	
	private Integer qty;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
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

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public product(Integer pid, String name, Double price, Integer qty) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}

	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

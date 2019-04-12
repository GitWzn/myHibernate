package com.wzn.myBeans;

import lombok.Data;

@Data
public class OrderInfo {
	private int id;
	private String goods;
	private int price;
	private int count;
	private int uid;

	// 多对一的映射
	private CustomerInfo customer;

	public OrderInfo(String goods, int price, int count, int uid) {
		this.goods = goods;
		this.price = price;
		this.count = count;
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "OrderInfo [id=" + id + ", goods=" + goods + ", price=" + price + "]";
	}

}

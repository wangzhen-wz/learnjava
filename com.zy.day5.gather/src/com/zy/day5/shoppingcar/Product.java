package com.zy.day5.shoppingcar;

import java.math.BigDecimal;

/**
 * 商品类
 *
 */
public class Product {
	
	//商品编号
	private int id;
	
	//商品名称
	private String name;
	
	//单价
	private BigDecimal price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Product(){
		
	}
	
	public Product(int id, String name, BigDecimal price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	//自定义方法最好对tostring方法进行重写
	@Override
	public String toString() {
		return "商品 [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}
	
	
}


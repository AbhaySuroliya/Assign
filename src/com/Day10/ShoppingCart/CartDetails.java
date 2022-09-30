package com.Day10.ShoppingCart;

public class CartDetails {
	 String name;
	 int quantity;
	 float price;
	 String category;
	 
	public CartDetails(String name,int quantity,float price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String cart) {
		this.category = cart;
	}
	@Override
	public String toString() {
		return "CartDetails [name=" + name + ", price=" + price + ", quantity=" + quantity + ", category=" + category + "]";
	}
}

package org.arpit.java2blog.bean;

public class Store {
	
private String gender;
private String product;
private String brand;
private int price;
private int quantity;
private int total;
public Store(String gender, String product, String brand, int price, int quantity, int total) {
	super();
	this.gender = gender;
	this.product = product;
	this.brand = brand;
	this.price = price;
	this.quantity = quantity;
	this.total = total;
}
public String getGender() {
	return gender;
}
public Store() {
	super();
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}

}

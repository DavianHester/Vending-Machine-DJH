package com.hestervending.vendingmachine;

public class Item {

	public String name;
	public int amount;
	public int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", amount='" + amount + '\'' +
                ", price=" + price +'}';
    }
	
	
	
	
	
	
}

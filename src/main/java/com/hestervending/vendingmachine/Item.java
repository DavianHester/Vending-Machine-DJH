package com.hestervending.vendingmachine;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Item {

	public String name;
	public int amount;
	public String price;
	
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
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

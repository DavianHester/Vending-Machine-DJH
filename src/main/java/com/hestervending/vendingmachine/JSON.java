package com.hestervending.vendingmachine;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class JSON {

	private Config config;
	private Item[] items;
	
	public Config getConfig() {
		return config;
	}
	public void setConfig(Config config) {
		this.config = config;
	}
	public Item[] getItems() {
		return items;
	}
	public void setItems(Item[] items) {
		this.items = items;
	}
    @Override
    public String toString() {
        return "{" +
                "config='" + config.getRows() + '\'' +
                ", items ='" + items + '}';
    }
}

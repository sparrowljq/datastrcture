package com.lzu.edu.designmode.builder;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author junqiangliu
 *	一顿饭
 */
public class Meal {
	private List<Item> items=new ArrayList<>();
	public void addItem(Item item) {
		items.add(item);
	}
	public float getCost() {
		float cost=0.0f;
		for(Item item:items) {
			cost+=item.price();
		}
		return cost;
	}
	public void showItems() {
		for(Item item:items) {
			System.out.println("商品："+item.name());
			System.out.println("包装"+item.packing().pack());
			System.out.println("价格"+item.price());
		}
	}

}

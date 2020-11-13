package com.lzu.edu.designmode.builder;
/**
 * 
 * @author junqiangliu
 *	鸡肉汉堡
 */
public class ChickenBurger extends Burger{

	@Override
	public String name() {
		return "鸡肉汉堡";
	}

	@Override
	public float price() {
		return 30.0f;
	}

}

package com.lzu.edu.designmode.builder;
/**
 * 
 * @author junqiangliu
 *	可口可乐实现类
 */
public class Coke extends ColdDrink{

	@Override
	public String name() {
		return "可口可乐";
	}

	@Override
	public float price() {
		return 35.0f;
	}

}

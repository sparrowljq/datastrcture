package com.lzu.edu.designmode.builder;
/**
 * 
 * @author junqiangliu
 *	冷饮父类
 */
public abstract class ColdDrink implements Item{
	@Override
	public Packing packing() {
		return new Bottle();
	}

	//每种冷饮的价格不相同
	public abstract float price();

}

package com.lzu.edu.designmode.builder;
/**
 * 
 * @author junqiangliu
 *	蔬菜汉堡集成汉堡
 */
public class VegBurger extends Burger{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "蔬菜汉堡！";
	}

	@Override
	public float price() {
		return 25.6f;
	}

}

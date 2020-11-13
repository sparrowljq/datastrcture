package com.lzu.edu.designmode.builder;
/**
 * 
 * @author junqiangliu
 *	汉堡的父类
 */
public abstract class Burger implements Item{
	public Packing packing() {
		return new Wrapper();
	}
	public abstract float price();
}

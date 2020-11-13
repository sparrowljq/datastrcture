package com.lzu.edu.designmode.builder;

/**
 * 
 * @author junqiangliu 商品接口
 */
public interface Item {
	public String name();

	public Packing packing();

	public float price();
}

package com.lzu.edu.designmode.builder;
/**
 * 
 * @author junqiangliu
 *	瓶子实现打包接口
 */
public class Bottle implements Packing{

	@Override
	public String pack() {
		return "用Bottle打包";
	}

}

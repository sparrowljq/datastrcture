package com.lzu.edu.designmode.factory.abstractfactory;
/**
 * 
 * @author junqiangliu
 *	红色实现颜色接口
 */
public class Red implements Color{

	@Override
	public void fill() {
		System.out.println("填充红色");
	}

}

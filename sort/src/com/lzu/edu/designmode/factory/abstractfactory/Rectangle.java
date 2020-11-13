package com.lzu.edu.designmode.factory.abstractfactory;
/**
 * 
 * @author junqiangliu
 * 矩型类实现shape接口
 */
public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("矩型实现draw方法");
	}

}

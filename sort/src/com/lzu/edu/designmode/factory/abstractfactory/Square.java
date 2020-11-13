package com.lzu.edu.designmode.factory.abstractfactory;
/**
 * 
 * @author junqiangliu
 *	正方形实现shape接口 实现draw方法
 */
public class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("正方形的draw方法");
	}

}

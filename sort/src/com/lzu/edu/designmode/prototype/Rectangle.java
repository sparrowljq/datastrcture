package com.lzu.edu.designmode.prototype;
/**
 * 
 * @author junqiangliu
 *	矩型扩展类
 */
public class Rectangle extends Shape {
	public Rectangle() {
		type = "长方形";
	}

	@Override
	public void draw() {
		System.out.println("矩形的draw方法");

	}

}

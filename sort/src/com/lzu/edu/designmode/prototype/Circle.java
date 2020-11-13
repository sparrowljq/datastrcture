package com.lzu.edu.designmode.prototype;
/**
 * 
 * @author junqiangliu
 *	圆的扩展类
 */
public class Circle extends Shape{
	public Circle() {
		type="圆";
	}
	@Override
	void draw() {
		System.out.println("圆的draw方法");
		
	}

}

package com.lzu.edu.designmode.prototype;
/**
 * 
 * @author junqiangliu
 *	正方形扩展类
 */
public class Square extends Shape{
	public Square() {
		type="正方形";
	}
	@Override
	public void draw() {
		System.out.println("正方形的draw方法");
		
	}

}

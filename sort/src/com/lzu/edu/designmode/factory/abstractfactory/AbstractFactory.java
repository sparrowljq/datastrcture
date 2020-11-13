package com.lzu.edu.designmode.factory.abstractfactory;
/**
 * 
 * @author junqiangliu
 *	为color和shape对象来创建抽象类来获取工厂
 */
public abstract class AbstractFactory {
	public abstract Color getcolor(String color);
	public abstract Shape getshape(String shape);
}

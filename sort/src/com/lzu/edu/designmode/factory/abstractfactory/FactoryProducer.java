package com.lzu.edu.designmode.factory.abstractfactory;
/**
 * 
 * @author junqiangliu
 *	工厂类的生成器
 *	抽象工厂模式是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。
 *	这种类型的设计模式属于创建型模式。它提供一种创建对象的最佳方式。
 *	在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定他们类，
 *	每个生成的工厂都能按照工厂模式提供对象。
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if(choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}else if(choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		}
		return null;
	}

}

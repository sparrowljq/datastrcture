package com.lzu.edu.designmode.factory.factory1;
/**
 * 
 * @author junqiangliu
 *	创建一个工厂 生成给定信息的实体类对象
 *	工厂模式属于创建模式，它提供了一种创建对象的最佳方式。在工厂模式中，
 *	我们在创建对象时不会对客户端暴露创建逻辑，并且通过使用一个共同的接口
 *	来指向新创建的对象。
 *	优点：1、一个调用者想创建一个对象，只知道其名称就可以了。2、扩展性高：
 *	如果想增加一个产品，只要扩展一个工厂类就可以了。3、屏蔽产品的具体实现，
 *	调用者只关心产品的接口。
 *	缺点：每次增加一个产品时，只需要增加一个具体的类和对象实现工厂，使得系统
 *	中的类的个数成倍的增加，在一定程度上增加了系统的复杂度，同时也增加了系统
 *	具体类的依赖。
 */
public class ShapeFactory {
	//根据不同的信息生成不同的值
	public Shape getShape(String shapeType) {
		if(shapeType==null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
}

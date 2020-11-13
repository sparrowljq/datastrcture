package com.lzu.edu.designmode.factory.abstractfactory;
/**
 * 
 * @author junqiangliu
 *	抽象工厂类案例
 */
public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		AbstractFactory shapeFactory=FactoryProducer.getFactory("SHAPE");
		Shape shape1 = shapeFactory.getshape("CIRCLE");
		//执行circle的draw方法
		shape1.draw();
		
		AbstractFactory shapeFactory1 = FactoryProducer.getFactory("COLOR");
		Color color = shapeFactory1.getcolor("RED");
		//执行red的方法
		color.fill();
	}
}

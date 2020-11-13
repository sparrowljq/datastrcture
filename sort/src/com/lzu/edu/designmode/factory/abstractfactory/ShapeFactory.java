package com.lzu.edu.designmode.factory.abstractfactory;
/**
 * 
 * @author junqiangliu
 *	抽象工厂的子类
 */
public class ShapeFactory extends AbstractFactory{

	@Override
	public Color getcolor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getshape(String shape) {
		if(shape==null) {
			return null;
		}
		if(shape.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}else if(shape.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}else if(shape.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}

		return null;
	}

}

package com.lzu.edu.designmode.factory.abstractfactory;
/**
 * 
 * @author junqiangliu
 *	颜色工厂类
 */
public class ColorFactory extends AbstractFactory{

	@Override
	public Color getcolor(String color) {
		if(color.equalsIgnoreCase("RED")) {
			return new Red();
		}else if(color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}else if(color.equalsIgnoreCase("GREEN")) {
			return new Green();
		}
		return null;
	}

	@Override
	public Shape getshape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}

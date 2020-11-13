package com.lzu.edu.cn.designmode.flyweight;

import java.util.HashMap;

public class ShapeFactory {
	private static final HashMap<String, Shape> circleMap=new HashMap<>();
	public static Shape getCircle(String color) {
		Circle circle = (Circle) circleMap.get(color);
		if(circle==null) {
			circle=new Circle(color);
			circleMap.put(color, circle);
			System.out.println("圆的颜色"+color);
		}
		return circle;
	}

}

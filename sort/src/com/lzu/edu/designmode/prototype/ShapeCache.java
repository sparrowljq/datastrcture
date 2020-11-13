package com.lzu.edu.designmode.prototype;

import java.util.Hashtable;

/**
 * 
 * @author junqiangliu
 *	创建一个类，从数据库获取实体类，并把它存储在一个Hashtable中
 */
public class ShapeCache {
	private static Hashtable<String, Shape> shapeMap=new Hashtable<>();
	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		//返回克隆对象
		return (Shape) cachedShape.clone();
	}
	public static void loadCache() {
		Circle circle=new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Square square=new Square();
		square.setId("2");
		shapeMap.put(square.getId(),square);
		
		Rectangle rectangle=new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
		
	}

}

package com.lzu.edu.cn.designmode.decorator;

public class ShapeDecorator implements Shape{
	protected Shape decroateShape;
	public ShapeDecorator(Shape decroateShape) {
		super();
		this.decroateShape = decroateShape;
	}

	@Override
	public void draw() {
		decroateShape.draw();
	}

}

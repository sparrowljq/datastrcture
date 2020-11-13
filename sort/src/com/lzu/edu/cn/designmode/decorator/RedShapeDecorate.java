package com.lzu.edu.cn.designmode.decorator;

public class RedShapeDecorate extends ShapeDecorator{

	public RedShapeDecorate(Shape decroateShape) {
		super(decroateShape);
	}
	public void draw() {
		decroateShape.draw();
		setRedBorder(decroateShape);
		
	}
	private void setRedBorder(Shape decorateShape) {
		System.out.println("边框颜色：红色");
	}

}

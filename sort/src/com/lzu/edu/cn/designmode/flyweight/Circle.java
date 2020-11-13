package com.lzu.edu.cn.designmode.flyweight;

public class Circle implements Shape{
	private String color;
	private int x;
	private int y;
	private int radius;
	
	public Circle(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("圆：draw()[颜色："+color+"圆心："+" ("+x+","+y+")"+"半径："+radius+"]");
	}

}

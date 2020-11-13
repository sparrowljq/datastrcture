package com.lzu.edu.cn.designmode.bridge;

public class RedCircle implements DrawAPI{

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("画红色的圆，半径"+radius+"圆心坐标（"+x+","+y+")");
	}

}

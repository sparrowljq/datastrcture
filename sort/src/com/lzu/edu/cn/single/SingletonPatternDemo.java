package com.lzu.edu.cn.single;
/**
 * 
 * @author junqiangliu
 *	单例模式
 */
public class SingletonPatternDemo {
	public static void main(String[] args) {
		//通过getInstance()方法来获取对象
		Singleton obj = Singleton.getInstance();
		//调用对象的方法
		obj.showMessage();
	}
}

package com.lzu.edu.cn.single.lazy;
/**
 * 
 * @author junqiangliu
 *	线程不安全的懒汉模式 这种放式懒加载明显，在多线程的情况下不能工作
 */
public class Singleton {
	private static Singleton instance;
	//私有化构造函数
	private Singleton() {
		
	}
	//获取对象的方法
	public static Singleton getInstance() {
		if(instance==null) {
			instance=new Singleton();
		}
		return instance;
	}
	
}

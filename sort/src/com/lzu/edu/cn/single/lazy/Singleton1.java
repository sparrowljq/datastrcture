package com.lzu.edu.cn.single.lazy;
/**
 * 
 * @author junqiangliu
 *	线程安全的懒汉模式的实现 这种方式能很好的在多线程的情况下工作，但是效率低。
 *	因为大多数情况下不需要同步。其优点是第一次调用才被初始化避免了内存的浪费。
 */
public class Singleton1 {
	private static Singleton1 instance;
	private Singleton1() {
		
	}
	public synchronized Singleton1 getInstance() {
		if(instance==null) {
			instance=new Singleton1();
		}
		return instance;
	}
}

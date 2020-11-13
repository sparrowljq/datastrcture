package com.lzu.edu.cn.single;
/**
 * 
 * @author junqiangliu
 *	单例模式(饿汉模式 线程安全的 因为在类加载的时候已经创建了实例对象)
 *	这种方式比较常用，但容易产生垃圾对象，优点 没有加锁，执行效率会提高
 *	缺点：类加载时就初始化，浪费内存
 */
public class Singleton {
	//创建SingleObject的一个对象
	private static Singleton instance=new Singleton();
	//让构造函数为private，这样该类就不会被实例化
	private Singleton() {}
	//获取唯一可用的对象
	public static Singleton getInstance() {
		return instance;
	}
	public void showMessage() {
		System.out.println("Hello World!");
	}
}

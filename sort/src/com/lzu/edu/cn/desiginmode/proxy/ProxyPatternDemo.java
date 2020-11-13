package com.lzu.edu.cn.desiginmode.proxy;
/**
 * 
 * @author junqiangliu
 *	代理模式中，一个类代表另一个类的功能。这种类型的设计模式属于结构型模式
 *	在代理模式中，我们创建具有现有对象的对象，以便向外界提供功能接口
 *	意图：为其他对象提供一种代理以控制对这个对象的访问，以便向外界提供功能接口。
 *	优点：1、职责清晰 2、高扩展性 3、智能化
 *	缺点：由于客户端和真实主题之间增加了代理对象，因此有些类型的代理模式
 *	可能会造成请求处理速度变慢。2、实现代理模式需要额外的工作，有些代理模式很复杂。
 */
public class ProxyPatternDemo {
	public static void main(String[] args) {
		ProxyImage image = new ProxyImage("kobe");
		//图像将从磁盘加载
		image.display();
		System.out.println("");
		//图像不需要从磁盘加载
		image.display();
	
	}
}

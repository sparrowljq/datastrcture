package com.lzu.edu.cn.designmode.flyweight;
/**
 * 
 * @author junqiangliu
 *	享元模式主要用于减少创建对象的数量，以减少内存占用和提高性能。这种类型的设计模式属于
 *	结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。
 *	意图：运用共享技术有效支持大量细粒度的对象。
 *	主要解决：在有大量对象时，有可能造成内存溢出，我们吧其中共同的部分抽象出来，如果有相同的业务请求，直接返回在内存中
 *	已有的对象，避免重新创建。
 *	应用实例：1、JAVA中的String,如果有则返回，如果没有则创建一个字符串保存在缓存池里边。 2、数据库的数据池。
 *	优点：大大减少对象的创建，降低系统内存，使效率提高。
 *	缺点：提高了系统的复杂度，需要分离出外部状态和内部状态，而且外部状态具有固有化的性质，不应该随着内部状态的变化而
 *  变化，否则会造成系统的混乱。
 *  使用场景：1、系统有大量相似的对象 2、需要缓冲池的场景
 */
public class FlyweightPatternDemo {
	private static final String colors[]= {"red","green","blue","white","black"};
	public static void main(String[] args) {
		for(int i=0;i<20;i++) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}
	private static String getRandomColor() {
		return colors[(int)(Math.random()*colors.length)];
	}
	private static int getRandomX() {
		return (int)(Math.random()*100);
	}
	private static int getRandomY() {
		return (int)(Math.random()*100);
	}
}

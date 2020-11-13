package com.lzu.edu.cn.designmode.decorator;
/**
 * 
 * @author junqiangliu
 * 装饰器模式 允许向一个现有的对象添加一个新的功能，同时又不改变其结构。这种类型的设计属于
 * 结构型模式，它是作为现有类的一个包装。这种模式创建了一个装饰类，用来包装原有的类，并在
 * 保持类方法签名完整的前提下，提供额外的功能。
 * 意图：动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活
 * 主要解决：一般的，我们为了扩展一个类经常使用继承的方式实现，由于继承为类引入静态特征，并且
 * 随着扩展功能的增多，子类会膨胀。
 * 优点：装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式
 * 可以动态扩展一个现实类的功能。
 * 缺点：多层装饰比较复杂
 * 说明：可替代继承
 */

public class DecoratorPatternDemo {
	public static void main(String[] args) {
		Shape circle=new Circle();
		ShapeDecorator redCircle=new RedShapeDecorate(new Circle());
		ShapeDecorator redRectangle=new RedShapeDecorate(new Rectangle());
		System.out.println("普通边框的圆");
		circle.draw();
		System.out.println("红色边框的圆");
		redCircle.draw();
		System.out.println("红色边框的矩型");
		redRectangle.draw();
	}
}

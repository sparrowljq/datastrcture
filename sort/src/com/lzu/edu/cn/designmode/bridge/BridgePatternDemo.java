package com.lzu.edu.cn.designmode.bridge;
/**
 * 
 * @author junqiangliu
 *	桥接使用于把抽象化与现实化解耦合，使二者可以独立变化，这种类型的设计模式数据结构型模式
 *	它通过提供抽象化和现实化之间的桥接结构来实现二者的解耦合。
 *	意图：将抽象部分与实现部分分离，是他们都可以独立的变化
 *	主要解决：在有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活。
 *	优点：1、抽象和实现的分离 2、优秀的扩展能力 3、实现细节对客户透明
 *	缺点：桥接模式的引入会增加系统的理解与设计难度，由于聚合关联关系建立在抽象层，要求
 *	开发者针对抽象进行设计与编程。
 *	应用场景：
 *  1、如果一个系统需要在构建的抽象化角色和具体角色之间增加更多的灵活性，避免在两个层之间
 *  建立静态的继承关系，通过桥接模式可以使他们在抽象层建立一个关联关系。2、对于那些不希望
 *  使用继承或因为多层次继承导致系统类的个数急剧增加的系统，桥接模式尤为使用 3、一个类存在
 *  两个独立变化的维度，且这两个维度都需要扩展
 *  说明：对于两个独立变化的维度，使用桥接模式再合适不过了。
 */
public class BridgePatternDemo {
	public static void main(String[] args) {
		Shape redCircle=new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle=new Circle(100, 100, 10, new GreenCircle());
		redCircle.draw();
		greenCircle.draw();
	}
}

package com.lzu.edu.cn.designmode.composite;
/**
 * 
 * @author junqiangliu
 *	组合模式（部分整体模式），是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示
 *	部分以及整体层次。这种类型的设计模式数据结构型模式，它创建了对象组的树形结构。这种模式创建了一个包含自己对象
 *	组的类。该类提供了修改相同对象组的方式。
 *	意图：将对象组合成树形结构以表示“部分-整体”层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
 *	解决问题：他在我们树型结构的问题中，模糊了简单元素和复杂元素的概念，客户程序可以像处理简单元素一样来处理复杂元素，
 *	从而使得客户程序与复杂元素内部解耦。
 *  使用情况：1、想表示对象的部分-整体层次结构（树形结构）2、希望用户忽略组合对象与单个对象的不同，用户将统一地使用
 *  组合结构中的所有对象。
 *  优点：1、高层模块调用简单 2、结点自由增加
 *  缺点：使用组合模式时，其叶子和树枝的声明都是实现类，而不是接口，违反了依赖倒置原则。
 *  依赖倒置原则：（上层模块不应该依赖底层模块，它们都应该依赖于抽象
 *  抽象不应该依赖于细节，细节应该依赖于抽象。）
 */
public class CompositePatternDemo {
	public static void main(String[] args) {
		Employee CEO=new Employee("John","CEO",30000);
		Employee headSales=new Employee("robert","head sales", 20000);
		Employee headMarketing=new Employee("kobe", "head Marketing", 20000);
		Employee cleck1=new Employee("Laura", "Marketing", 10000);
		Employee cleck2=new Employee("Bob", "Marketing", 10000);
		Employee saleExecutive1=new Employee("Richard", "Sales", 10000);
		Employee salExecutive2=new Employee("Rob", "Sales", 10000);
		
		CEO.add(headSales);
		CEO.add(headMarketing);
		
		headSales.add(saleExecutive1);
		headSales.add(salExecutive2);
		
		headMarketing.add(cleck1);
		headMarketing.add(cleck2);

		System.out.println(CEO);
		for(Employee headEmployee:CEO.getSubordinates()) {
			System.out.println(headEmployee);
			for(Employee employee:headEmployee.getSubordinates()) {
				System.out.println(employee);
			}
		}
		
	}
}

package com.lzu.edu.designmode.builder;
/**
 * 
 * @author junqiangliu
 *	建造者模式案例
 *	建造者模式使用多个简单的对象一步一步构建成一个复杂的对象。
 *	这种类型的设计模式属于创建模型式，它提供了一种创建对象的最佳的方式。
 *	一个Builder类会一步一步构造最终的对象。该Builder类是独立于其他对象的
 *	优点：1、建造者独立，易扩展 2、便于控制细节风险（用于一些基本部件不变，
 *	但组合经常改变。）
 */
public class BuilderPatternDemo {
	public static void main(String[] args) {
		MealBuilder mealBuilder=new MealBuilder();
		Meal vegMeal=mealBuilder.prepareVegMeal();
		System.out.println("蔬菜 餐");
		vegMeal.showItems();
		System.out.println("总共"+vegMeal.getCost());
		
		Meal nonVegMeal=mealBuilder.prepareNonVegMeal();
		System.out.println("非蔬菜餐");
		nonVegMeal.showItems();
		System.out.println("总共"+nonVegMeal.getCost());
	}

}

package com.lzu.edu.cn.designmode.filter;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author junqiangliu
 *	过滤器模式允许开发人员使用不同的标准过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来
 *	这种类型的设计模式属于结构型设计模式，他结合多个标准来获得单一的标准。
 */
public class CriteriaPatternDemo {
	public static void main(String[] args) {
		List<Person> persons=new ArrayList<>();
		persons.add(new Person("Rebert", "Male", "Single"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Single"));
		persons.add(new Person("Bobby", "Male", "Single"));
		
		Criteria male=new CriteriaMale();
		Criteria female=new CriteriaFemale();
		Criteria single=new CriteriaSingle();
		Criteria singleMale=new AndCriteria(single, male);
		Criteria singleOrFemale=new OrCriteria(single, female);
		
		System.out.println("女性：");
		printPersons(male.meetCriteria(persons));
		System.out.println("男性：");
		printPersons(female.meetCriteria(persons));
		System.out.println("单身女性：");
		printPersons(singleMale.meetCriteria(persons));
		System.out.println("单身 或者 男性：");
		printPersons(singleOrFemale.meetCriteria(persons));
		
		
		
	}
	public static void printPersons(List<Person> persons) {
		for(Person person:persons) {
			System.out.println("Person:[姓名:"+person.getName()+"性别:"+person.getGender()
			+"婚姻："+person.getMaritalStatus()+"]");
		}
		
	}
}

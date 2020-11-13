package com.lzu.edu.designmode.prototype;
/**
 * 
 * @author junqiangliu
 *	原型模式是用于创建重复的对象，同时又能保证性能。这种类型的设计模式
 *	属于创建型模式，它提供了一种创建对象的最佳方式。
 *	这种模式是实现一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象代价
 *	比较大时，采用这种模式。(比如，一个对象需要在一个高代价的数据库操作之后被
 * 创建。我们可以缓存该对象，在下一个请求时返回它的克隆，在需要的时候更新数据库)
 * 优点：1.性能提高 2.逃避构造函数的约束
 * 缺点：1.必须实现cloneable接口 2.配备克隆方法需要对类的功能进行通盘考虑，
 * 这对于全新的类不是很难，但对于已有的类不一定很容易，特别当一个类引用不支持
 * 串行化的间接对象（深拷贝是通过Serializable读取二进制流），或者引用含有循环结构的时候。
 * 在实际应用中：原型模式一般很少单独使用，一般是和工厂方法模式一起出现，通过clone
 * 方法创建一个对象，然后由工厂方法提供给方法调用者。
 */
public abstract class Shape implements Cloneable{
	private String id;
	protected String type;
	abstract void draw();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Object clone() {
		Object clone=null;
		try {
			clone=super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clone;
	}
}

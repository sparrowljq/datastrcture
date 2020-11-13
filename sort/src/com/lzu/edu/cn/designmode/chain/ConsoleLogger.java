package com.lzu.edu.cn.designmode.chain;

public class ConsoleLogger extends AbstractLogger{
	public ConsoleLogger(int level) {
		this.level=level;
	}
	@Override
	protected void write(String message) {
		System.out.println("控制台输出："+message);
	}
}

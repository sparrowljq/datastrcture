package com.lzu.edu.cn.designmode.chain;

public class ErrorLogger extends AbstractLogger{
	public ErrorLogger(int level) {
		this.level=level;
	}
	@Override
	protected void write(String message) {
		System.out.println("错误控制台："+message);
	}
	
}

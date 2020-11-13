package com.lzu.edu.cn.designmode.chain;

public class FileLogger extends AbstractLogger{
	public FileLogger(int level) {
		this.level=level;
	}

	@Override
	protected void write(String message) {
		System.out.println("文件日志："+message);
	}

}

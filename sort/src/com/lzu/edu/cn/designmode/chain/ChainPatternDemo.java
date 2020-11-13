package com.lzu.edu.cn.designmode.chain;

public class ChainPatternDemo {
	private static AbstractLogger getChainOfLoggers() {
		AbstractLogger errorLogger=new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger=new  FileLogger(AbstractLogger.DEBUG);
		AbstractLogger conLogger=new ConsoleLogger(AbstractLogger.INFO);
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(conLogger);
		return errorLogger;
	}
	public static void main(String[] args) {
		AbstractLogger loggerchain=getChainOfLoggers();
		loggerchain.logMessage(AbstractLogger.INFO, "这是info级别的信息");
		loggerchain.logMessage(AbstractLogger.DEBUG, "这是debug级别的信息");
		loggerchain.logMessage(AbstractLogger.ERROR, "这是error级别的信息");
	}
}

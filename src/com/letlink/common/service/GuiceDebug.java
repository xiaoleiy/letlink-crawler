package com.letlink.common.service;

import java.util.logging.Formatter;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class GuiceDebug {
	private static final Handler HANDLER = new ConsoleHandler(){
		{
			setLevel(Level.ALL);
			setFormatter(new Formatter(){
				public String format(LogRecord rec){
					return String.format("[Guice Debug] %s%n", rec.getMessage());
				}
			});
		}
	};
	private GuiceDebug(){}
	public static void enable(){
		Logger guiceLogger = Logger.getLogger("com.google.inject");
		guiceLogger.addHandler(HANDLER);
		guiceLogger.setLevel(Level.ALL);
	}
}

package com.matt.robot.utils;

import java.util.logging.*;

public class Logger {

	private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Logger.class.getName());

	static {
		ConsoleHandler handler = new ConsoleHandler();
		handler.setFormatter(new SimpleFormatter());
		logger.addHandler(handler);
		logger.setUseParentHandlers(false);
	}

	public static void info(String message) {
		logger.log(Level.INFO, message);
	}

	public static void error(String message) {
		logger.log(Level.SEVERE, message);
	}
}

package com.revature.calculatorapp.util;

public class Logger {

	private Logger() {

	}

	private static final Logger LOGGER = new Logger();

	public static Logger getInstance() {
		return LOGGER;
	}

	public void debug(String message) {
		// System.out.println(message);
	}

	public void info(String message) {
		// System.out.println(message);
	}

	public void error(String message) {
		System.err.println(message);
	}

	public void error(Exception e) {
		// e.printStackTrace();
	}

	public void print(String message) {
		System.out.println(message);
	}

}

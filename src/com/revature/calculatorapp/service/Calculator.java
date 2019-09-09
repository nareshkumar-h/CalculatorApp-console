package com.revature.calculatorapp.service;

import com.revature.calculatorapp.exception.ValidatorException;
import com.revature.calculatorapp.util.Logger;

public class Calculator {

	private static final Logger LOGGER = Logger.getInstance();

	public static int add(Integer a, Integer b) {
		int c = 0;
		try {
			c = a + b;
			LOGGER.info("C= " + c);
			return c;
		} catch (Exception e) {
			LOGGER.error(e);
		}
		return c;
	}

	public static int mul(Integer a, Integer b) {
		int c = 0;
		try {
			c = a * b;
			LOGGER.info("C= " + c);
			return c;
		} catch (Exception e) {
			LOGGER.error(e);
		}
		return c;
	}

	public static float div(Integer a, Integer b) throws ValidatorException {
		float c = 0;

		if (b == 0) {
			throw new ValidatorException("Invalid input, we cannot divide by zero.");
		}
		c = (float) a / b;
		LOGGER.info("C= " + c);
		return c;
	}
}

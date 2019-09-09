package com.revature.calculatorapp.validator;

import com.revature.calculatorapp.exception.ValidatorException;

public class AdditionValidator {

	public static void validate(int a, int b) throws ValidatorException {

		if (a == 0) {
			throw new ValidatorException("Input cannot be zero");
		}

		if (b == 0) {
			throw new ValidatorException("Input cannot be zero");
		}
	}
}

package com.revature.calculatorapp.ui.flow;

import com.revature.calculatorapp.service.Calculator;
import com.revature.calculatorapp.util.Logger;
import com.revature.calculatorapp.util.ScannerUtil;

public class MultiplicationFlow extends Flow {

	private static final Logger LOGGER = Logger.getInstance();

	@Override
	protected void process(ScannerUtil sc) throws Exception {

		int a = sc.getInputAsInt("Enter the 1st num");
		int b = sc.getInputAsInt("Enter the 2nd num");
		int x = Calculator.mul(a, b);
		LOGGER.print("Multiplication Result :" + x);

	}
}

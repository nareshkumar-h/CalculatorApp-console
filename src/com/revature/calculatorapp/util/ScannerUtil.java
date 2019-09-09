package com.revature.calculatorapp.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtil {

	private static final Logger LOGGER = Logger.getInstance();

	private Scanner sc;

	public ScannerUtil(Scanner sc) {
		this.sc = sc;
	}

	public int getInputAsInt(String message) {
		int a = 0;
		while (true) {
			LOGGER.print(message);
			try {
				a = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				LOGGER.error("Invalid Input");
				sc.nextLine();

			}
		}
		return a;
	}

	public int getInputAsValidInt(String message) {
		int a = 0;
		while (true) {
			LOGGER.print(message);
			try {
				a = sc.nextInt();
				if (a == 0) {
					throw new InputMismatchException("Invalid Input");
				}
				break;
			} catch (InputMismatchException e) {
				LOGGER.error("Invalid Input");
				sc.nextLine();

			}
		}
		return a;
	}

	// Clear invalid input from scanner buffer.
	public void clear() {
		sc.nextLine();
	}

	public void close() {
		sc.close();
	}
}

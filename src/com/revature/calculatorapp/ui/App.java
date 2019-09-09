package com.revature.calculatorapp.ui;

import java.util.Scanner;

import com.revature.calculatorapp.ui.flow.AdditionFlow;
import com.revature.calculatorapp.ui.flow.DivisionFlow;
import com.revature.calculatorapp.ui.flow.MultiplicationFlow;
import com.revature.calculatorapp.util.Logger;
import com.revature.calculatorapp.util.ScannerUtil;

public class App {

	private static final Logger LOGGER = Logger.getInstance();

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ScannerUtil sc = new ScannerUtil(scanner);

		boolean loop = true;

		while (loop) {

			int choice = sc.getInputAsInt("Press 1. Addition 2. Division 3. Multiplication 4.Exit ");

			switch (choice) {
			case 1:
				LOGGER.info("---ADDITION PROCESS (STARTED)-----");

				new AdditionFlow().start(sc);

				LOGGER.info("---ADDITION PROCESS (COMPLETED)----");

				break;

			case 2:

				LOGGER.info("---DIVISION PROCESS (STARTED)-----");
				while (true) {

					try {
						new DivisionFlow().start(sc);
						break;
					} catch (Exception e) {
						LOGGER.error(e.getMessage());
						scanner.nextLine();
					}
				}
				LOGGER.info("---DIVISION PROCESS (COMPLETED)----");

				break;
			case 3:

				LOGGER.info("---Multiplication PROCESS (STARTED)-----");
				while (true) {

					try {
						new MultiplicationFlow().start(sc);
						break;
					} catch (Exception e) {
						LOGGER.error(e.getMessage());
						scanner.nextLine();
					}
				}
				LOGGER.info("---Multiplication PROCESS (COMPLETED)----");

				break;
			case 4:
				loop = false;
				LOGGER.info("---Thank You ---");
				break;

			default:
				LOGGER.error("Invalid Input");
				break;
			}

		}

		// close scanner
		sc.close();
		scanner.close();

	}

}

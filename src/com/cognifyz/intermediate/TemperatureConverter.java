package com.cognifyz.intermediate;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Enter your temperature: ");
			double temperature = scan.nextInt();

			System.out.println("Select which conversion you want\n1. Celsius -> Fahrenheit\n2. Fahrenheit -> Celsius");
			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				double fahrenheit = (9.0 / 5.0) * temperature + 32;
				System.out.printf("Temperature in Fahrenheit: %.1f%n ", fahrenheit);
				break;

			case 2:
				double celsius = (5.0 / 9.0) * (temperature - 32);
				System.out.printf("Temperature in Celsius: %.1f%n", celsius);
				break;

			default:
				System.out.println("Invalid choice! Please select 1 or 2.");
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input! please select correct option");
		}

		scan.close();
	}
}
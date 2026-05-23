package com.cognifyz.beginner;

import java.util.Scanner;

public class NumberPatterns {

	public void triangle(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}

	public void invertedTriangle(int rows) {
		for (int i = rows; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}

	public void pyramid(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = rows - i; j > 0; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}

			System.out.println();
		}
	}

	public void invertedPyramid(int rows) {
		for (int i = rows; i >= 1; i--) {
			for (int j = rows - i; j > 0; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}

			System.out.println();
		}
	}

	public void square(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}

	public void diamond(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = rows - i; j > 0; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}

			System.out.println();
		}

		for (int i = rows - 1; i >= 1; i--) {
			for (int j = rows - i; j > 0; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}

			System.out.println();
		}
	}

	public void hollowPyramid(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = rows - i; j > 0; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				if (i == 1 || i == rows || k == 1 || k == i) {
					System.out.print(k);
				} else {
					System.out.print(" ");

				}

				if (k < i) {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}

	public void zigzag(int rows) {
		for (int i = 1; i <= rows; i++) {
			int spaces;

			if (i <= (rows + 1) / 2) {
				spaces = (i - 1) * 2;
			} else {
				spaces = (rows - i) * 2;
			}

			for (int j = 0; j < spaces; j++) {
				System.out.print(" ");
			}

			System.out.println(i);
		}
	}

	public void success() {
		System.out.println("Pattern Generated Successfully!");
	}

	public static void main(String[] args) {
		NumberPatterns pattern = new NumberPatterns();
		Scanner scan = new Scanner(System.in);

		System.out.println("Select your Pattern: ");
		System.out.println("1. Triangle\n2. Inverted Triangle\n3. Pyramid\n4. Inverted Pyramid\n5. Square\n6. Diamond\n7. Hollow pyramid\n8. Zigzag");

		int n = scan.nextInt();
		System.out.println("Enter no of rows you want");
		int rows = scan.nextInt();

		switch (n) {
		case 1:
			pattern.triangle(rows);
			pattern.success();
			break;

		case 2:
			pattern.invertedTriangle(rows);
			pattern.success();
			break;

		case 3:
			pattern.pyramid(rows);
			pattern.success();
			break;

		case 4:
			pattern.invertedPyramid(rows);
			pattern.success();
			break;

		case 5:
			pattern.square(rows);
			pattern.success();
			break;

		case 6:
			pattern.diamond(rows);
			pattern.success();
			break;

		case 7:
			pattern.hollowPyramid(rows);
			pattern.success();
			break;

		case 8:
			pattern.zigzag(rows);
			pattern.success();
			break;

		default:
			System.out.println("Invalid Please enter valid option");
		}

		scan.close();
	}
}
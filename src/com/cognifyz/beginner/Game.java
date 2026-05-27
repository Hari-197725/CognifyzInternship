package com.cognifyz.beginner;

import java.util.Random;
import java.util.Scanner;

import com.cognifyz.model.QuizModel;

public class Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Choose what type of game you want: ");
		System.out.println("1. Quiz Game\n2. Guessing Number Game");

		int choice = scan.nextInt();
		scan.nextLine();
		int quizGamePoints = 0;

		switch (choice) {
		case 1:
			for (QuizModel que : QuizModel.getMockData()) {
				System.out.println(que.getQuestion());
				String ans = scan.nextLine().trim().replaceAll("\\s+", " ").toLowerCase();

				if (ans.equals(que.getAnswer())) {
					quizGamePoints++;
					System.out.println("Correct answer!");
				} else {
					System.out.println("Your answer is wrong the correct answer is: " + que.getAnswer());
				}
			}

			if (quizGamePoints >= 6) {
				System.out.println("Congratulations! You WIN: " + quizGamePoints + "/10");
			} else {
				System.out.println("You LOSS: " + quizGamePoints + "/10");
			}

			break;

		case 2:
			Random random = new Random();
			int secretNum = random.nextInt(100) + 1;
			int attempt = 3;

			System.out.println("Guess the number \"1-100\" ");
			System.out.println("You have 3 attempts");

			while (attempt > 0) {
				int guess = scan.nextInt();

				if (guess < 0 || guess > 100) {
					System.out.println("You entered out of range please guess a number between 1 to 100");
					continue;
				}

				if (guess > secretNum) {

					if (guess - secretNum <= 5) {
						System.out.println("Almost there, reduce the number a little.");
					} else {
						System.out.println("Try a smaller number!");
					}

				} else if (guess < secretNum) {

					if (secretNum - guess <= 5) {
						System.out.println("Increase your guess a little.");
					} else {
						System.out.println("Try a bigger number!");
					}

				} else {
					System.out.println("Excellent! You found the correct number.");
					break;
				}

				attempt--;
				System.out.println("Attempts left: " + attempt);

			}

			System.out.println("Game Over! The number was: " + secretNum);

			break;

		default:
			System.out.println("Invalid Choice! Please select game 1 or 2");
		}

		scan.close();
	}
}
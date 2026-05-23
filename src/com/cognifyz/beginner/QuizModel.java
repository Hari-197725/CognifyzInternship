package com.cognifyz.beginner;

import java.util.ArrayList;
import java.util.List;

public class QuizModel {
	String question;
	String answer;

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public static List<QuizModel> getMockData() {

		List<QuizModel> questions = new ArrayList<QuizModel>();
		QuizModel que1 = new QuizModel(); // 1000
		que1.setAnswer("New Delhi");
		que1.setQuestion("What is the capital of India?");
		questions.add(que1);

		QuizModel que2 = new QuizModel();
		que2.setQuestion("How many oceans are there in the world ?");
		que2.setAnswer("5");
		questions.add(que2);

		QuizModel que3 = new QuizModel();
		que3.setQuestion("Which planet is known as the red planet ?");
		que3.setAnswer("mars");
		questions.add(que3);

		QuizModel que4 = new QuizModel();
		que4.setQuestion("What is the largest ocean in the world ?");
		que4.setAnswer("the pacific ocean");
		questions.add(que4);

		QuizModel que5 = new QuizModel();
		que5.setQuestion("Who wrote the Indian national anthem ?");
		que5.setAnswer("rabindranath tagore");
		questions.add(que5);

		QuizModel que6 = new QuizModel();
		que6.setQuestion("Who invented the telephone ?");
		que6.setAnswer("alexander graham bell");
		questions.add(que6);

		QuizModel que7 = new QuizModel();
		que7.setQuestion("Which festial is known as the Festival of Lights ?");
		que7.setAnswer("diwali");
		questions.add(que7);

		QuizModel que8 = new QuizModel();
		que8.setQuestion("Who is known as the missile man of India ?");
		que8.setAnswer("dr. apj abdul kalam");
		questions.add(que8);

		QuizModel que9 = new QuizModel();
		que9.setQuestion("What is the largest desert in world ?");
		que9.setAnswer("the sahara desert");
		questions.add(que9);

		QuizModel que10 = new QuizModel();
		que10.setQuestion("Which gas do plants takes in for photosynthesis ?");
		que10.setQuestion("carbon dioxide");
		questions.add(que10);

		return questions;
	}
}
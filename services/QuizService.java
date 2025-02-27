package services;

import models.Question;
import java.util.Scanner;

public class QuizService {
    private Question[] questions;
    private int score;
    private Scanner scanner;

    public QuizService() {
        this.questions = new Question[]{
            new Question("Who is the current Prime Minister of India (2024)?", new String[]{"1) Narendra Modi", "2) Rahul Gandhi", "3) Arvind Kejriwal", "4) Manmohan Singh"}, 1),
            new Question("What is the capital of the United States?", new String[]{"1) New York", "2) Washington D.C.", "3) Los Angeles", "4) Chicago"}, 2),
            new Question("Which planet is known as the Red Planet?", new String[]{"1) Earth", "2) Venus", "3) Mars", "4) Jupiter"}, 3),
            new Question("Who was the first President of the United States?", new String[]{"1) George Washington", "2) Abraham Lincoln", "3) Thomas Jefferson", "4) John Adams"}, 1),
            new Question("What is the largest ocean on Earth?", new String[]{"1) Atlantic Ocean", "2) Indian Ocean", "3) Arctic Ocean", "4) Pacific Ocean"}, 4),
            new Question("Which is the national animal of India?", new String[]{"1) Elephant", "2) Lion", "3) Tiger", "4) Leopard"}, 3),
            new Question("Who discovered gravity?", new String[]{"1) Albert Einstein", "2) Isaac Newton", "3) Galileo Galilei", "4) Nikola Tesla"}, 2),
            new Question("What is the full form of CPU?", new String[]{"1) Central Processing Unit", "2) Central Programming Unit", "3) Computer Processing Unit", "4) Core Processing Unit"}, 1),
            new Question("Which is the longest river in the world?", new String[]{"1) Amazon River", "2) Ganges River", "3) Nile River", "4) Mississippi River"}, 3),
            new Question("Which country won the FIFA World Cup in 2022?", new String[]{"1) Brazil", "2) France", "3) Argentina", "4) Germany"}, 3)
        };
        this.score = 0;
        this.scanner = new Scanner(System.in);
    }

    public void startQuiz() {
        System.out.println("\n==== Welcome to the Online Quiz System ====\n");

        for (Question question : questions) {
            System.out.println(question.getQuestion());
            for (String option : question.getOptions()) {
                System.out.println(option);
            }

            System.out.print("Enter your choice (1-4): ");
            int answer = scanner.nextInt();

            if (answer == question.getCorrectAnswer()) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was: " + question.getCorrectAnswer() + "\n");
            }
        }

        System.out.println("Quiz Completed!");
        System.out.println("Your final score: " + score + "/" + questions.length);
    }
}

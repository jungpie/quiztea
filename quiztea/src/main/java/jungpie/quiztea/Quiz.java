/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jungpie.quiztea;
/**
 *
 * @author JungPie
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions = new ArrayList<>();
    private int score;

    public void loadQuestions() {
        // For simplicity, add some hardcoded questions
        questions.add(new Question("What's the capital of France?", 
            new String[]{"Berlin", "Paris", "Madrid", "Rome"}, 1));
        // ... add more questions similarly
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        for(Question question : questions) {
            System.out.println(question.getQuestionText());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i+1) + ". " + options[i]);
            }
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            if(question.isAnswerCorrect(answer - 1)) {
                score++;
            }
        }
    }

    public void displayScore() {
        System.out.println("Your score is: " + score + "/" + questions.size());
    }
}

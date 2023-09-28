/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jungpie.quiztea;

/**
 *
 * @author JungPie
 */
public class Question {
    private String questionText;
    private String[] options;
    private int correctAnswerIndex;

    // Constructor
    public Question(String questionText, String[] options, int correctAnswerIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    // Getters, setters, and other methods
    public boolean isAnswerCorrect(int chosenIndex) {
        return correctAnswerIndex == chosenIndex;
    }
}

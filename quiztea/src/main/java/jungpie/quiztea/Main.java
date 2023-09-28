/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jungpie.quiztea;

/**
 *
 * @author JungPie
 */
public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.loadQuestions();
        quiz.start();
        quiz.displayScore();
    }
}

package unit_05.ProgrammingAssignment;

import javax.swing.*;

public abstract class Question {
    abstract String ask();

    // class variables
    static int nQuestions = 0;
    static int nCorrect = 0;

    // instance variables
    String question;
    String correctAnswer;

    void check() {
        nQuestions++;
        String answer = ask();

        if (answer.equals(correctAnswer)) {
            // increment correct answers for correct answers
            nCorrect++;
            JOptionPane.showMessageDialog(null, "Correct!");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer);
        }

    }
    static void showResults() {
        JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions.");
    }
}

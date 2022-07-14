package unit_04;

import javax.swing.*;

public class MultipleChoiceQuestion {

    // class variables
    static int nQuestions = 0;
    static int nCorrect = 0;

    // instance variables
    String question;
    String correctAnswer;

    // constructor
    // constructors have no retur type. their name is the return type
    public MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {

        question = query+"\n";
        question += "A. "+a+"\n";
        question += "B. "+b+"\n";
        question += "C. "+c+"\n";
        question += "D. "+d+"\n";
        question += "E. "+e+"\n";

        correctAnswer = answer;
        answer = answer.toUpperCase();
    }

    String ask() { // it does not need parameters because it will use the instance variables

        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            boolean valid = (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E"));

            if (valid) return answer;
            JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
        }
    }

    void check() {
        nQuestions++;
        String answer = ask();

        if (answer.equals(correctAnswer)) {
            JOptionPane.showMessageDialog(null,"Correct!");
            nCorrect++;
        } else {
            JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is "+correctAnswer+".");
        }
    }

    static void showResults() {
        JOptionPane.showMessageDialog(null,nCorrect+" correct out of "+nQuestions+" questions");
    }
}

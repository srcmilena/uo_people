package unit_05.ProgrammingAssignment;

import javax.swing.*;

public class MultipleChoiceQuestion extends Question {

    public MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
        question = query+"\n";
        question += "A. "+a+"\n";
        question += "B. "+b+"\n";
        question += "C. "+c+"\n";
        question += "D. "+d+"\n";
        question += "E. "+e+"\n";

        correctAnswer = answer.toUpperCase();
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
}

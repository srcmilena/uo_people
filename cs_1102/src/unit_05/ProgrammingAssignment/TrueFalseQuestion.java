package unit_05.ProgrammingAssignment;

import javax.swing.*;

public class TrueFalseQuestion extends Question {

    @Override
    String ask() {
        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            if (answer.equals("Y") || answer.equals("T") || answer.equals("YES"))
                answer = "TRUE";

            if (answer.equals("N") || answer.equals("F") || answer.equals("NO"))
                answer = "FALSE";

            boolean valid = (answer.equals("FALSE") || answer.equals("TRUE"));

            if (valid)
                return answer;
            JOptionPane.showMessageDialog(null, "Invalid answer. Please enter TRUE or FALSE.");
        }
    }

    TrueFalseQuestion(String question, String answer) {
        this.question = "TRUE or FALSE: " + question;
        answer = answer.toUpperCase();

        if (answer.equals("TRUE") || answer.equals("T") ||  answer.equals("YES") || answer.equals("Y"))
            correctAnswer = "TRUE";

        if (answer.equals("FALSE") || answer.equals("F") || answer.equals("NO") || answer.equals("N"))
            correctAnswer = "FALSE";
    }
}

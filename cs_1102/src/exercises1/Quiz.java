package exercises;

import javax.swing.JOptionPane;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// output
		String question = "What is Java?\n" + "a) Concept\n" + "b) Data type\n" + "c) Condition\n" + "d) Markup language\n" + "e) Programming language\n"; // "\n" = new line
		
		// loop
		while (true) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			
			// condition
			if (answer.equals("E")) {
				JOptionPane.showMessageDialog(null, "Correct!");
				break;
				} else if ((answer.equals("A")) || (answer.equals("B")) || (answer.equals("C")) || (answer.equals("D"))) {
					JOptionPane.showMessageDialog(null, "Incorrect. Please try again.");
					} else {
						JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
						}
					}    
				}
	}
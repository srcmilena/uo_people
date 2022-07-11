package ProgrammingAssignment;

import javax.swing.JOptionPane;

public class Quiz {
	
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	public static void main(String[] args) {

		// input
		String asking = "When did they create is Java?\n" + "a) 2005\n" + "b) 2000\n" + "c) 1999\n" + "d) 1995\n" + "e) 1991\n";
		
		check(asking, "1991");

		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions");
		
	}
	
	public static String ask (String question) {
		
		// loop
		while (true) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			

			// condition
			if (answer.equals("E")) {
				JOptionPane.showMessageDialog(null, "Correct!");
				//break;
				} else if ((answer.equals("A")) || (answer.equals("B")) || (answer.equals("C")) || (answer.equals("D"))) {
					JOptionPane.showMessageDialog(null, "Incorrect. Please try again.");
					} else {
						JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
						continue;
						}
			
			return answer;
			
					}
	}

	public static void check (String question, String correctAnswer) {
	
	String answer = ask (question);
	nQuestions++;
	
	if(correctAnswer.equals(answer)) {
	    JOptionPane.showMessageDialog(null,"Correct!");
	    
	    nCorrect++;
	    } else {
	    JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is " + correctAnswer);
	    }
	}
	
}
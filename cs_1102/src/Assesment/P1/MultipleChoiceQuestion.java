package default_package;

import javax.swing.JOptionPane;

public class MultipleChoiceQuestion extends Question {
	
	public MultipleChoiceQuestion(String query, String a, String b,
						String c, String d, String e, String answer) {
		//the question itself
		question = query+"\n";
		//the multiple choices
		question += "A) "+a+"\n";
		question += "B) "+b+"\n";
		question += "C) "+c+"\n";
		question += "D) "+d+"\n";
		question += "E) "+e+"\n";
		//the correct answer
		correctAnswer = answer.toUpperCase();


	}//end MultipleChoiceQuestion constructor
	
//the ASK instance method
	public String ask(){
		while (true) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			boolean valid = (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E"));
			if (valid) return answer;
			JOptionPane.showMessageDialog(null, "Your answer was invalid.  Please try again.");

		}
	}//end ASK	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}//end main
}// end class

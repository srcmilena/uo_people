package default_package;

import javax.swing.JOptionPane;

public abstract class Question {
	
	static int nQuestions = 0;
	static int nCorrect = 0;
	String question;
	String correctAnswer;

	
	//the CHECK instance method
	void check() {
		nQuestions++;
		String answer = ask();
		if (answer.equals(correctAnswer)){
			nCorrect++;
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect, the correct answer is: "+correctAnswer);
			
		}
	}//end CHECK
	
	//ABSTRACT ASK METHOD
	abstract String ask();
	
	
	//the SHOWRESULTS class method
	static void showResults() {
		JOptionPane.showMessageDialog(null, "You got "+nCorrect+" questions correct out of "+nQuestions);
		}//end SHOWRESULTS

}

package default_package;
import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {

	public TrueFalseQuestion(String question, String answer){
		this.question = "TRUE or FALSE: " + question;
		
		
		if (answer.equals("f") || answer.equals("false")|| answer.equals("False")|| answer.equals("FALSE")|| answer.equals("n")|| 
				answer.equals("no")|| answer.equals("No")|| answer.equals("NO")){
			this.correctAnswer = "FALSE";
		}
		else if (answer.equals("t")|| answer.equals("true")|| answer.equals("T") || 
					answer.equals("True")|| answer.equals("TRUE")|| answer.equals("y")|| answer.equals("yes")|| answer.equals("Y")|| answer.equals("Yes")|| 
					answer.equals("YES")) {
			this.correctAnswer = "TRUE";
		}
		
	}
	
	
	@Override
	String ask(){
		while (true) {
			String answer = JOptionPane.showInputDialog(question);
			boolean valid = (answer.equals("f") || answer.equals("false")|| answer.equals("False")|| answer.equals("FALSE")|| answer.equals("n")|| 
					answer.equals("no")|| answer.equals("No")|| answer.equals("NO")|| answer.equals("t")|| answer.equals("true")|| answer.equals("T") || 
					answer.equals("True")|| answer.equals("TRUE")|| answer.equals("y")|| answer.equals("yes")|| answer.equals("Y")|| answer.equals("Yes")|| 
					answer.equals("YES"));
			if (valid) {
				if (answer.equals("f") || answer.equals("false")|| answer.equals("False")|| answer.equals("FALSE")|| answer.equals("n")|| 
						answer.equals("no")|| answer.equals("No")|| answer.equals("NO"))
						return "FALSE";
				else
					return "TRUE";
			}
			JOptionPane.showMessageDialog(null, "Your answer was invalid.  Please enter 'TRUE' or 'FALSE'.");

		}
	}//end ASK	

	
	
}

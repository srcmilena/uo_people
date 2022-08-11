import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {
	
	     //-----------Constructor-------------//
	
	
	TrueFalseQuestion(String question, String answer){ //open Constructor
		
		this.question = "TRUE OR FALSE :"+ question;
		correctAnswer = answer;
	}//close Constructor
	
	

	@Override
	String ask() {
		String answer;
		
		while(true) {//open while loop
			
			answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			
			if (answer.equals("f")
					|| answer.equals("F")
					|| answer.equals("false")
					|| answer.equals("False")
					|| answer.equals("FALSE")
					|| answer.equals("NO")
					|| answer.equals("N")
					|| answer.equals("n")
					|| answer.equals("no")
					|| answer.equals("No")) { // open if statement 
				return answer;
			}
				
				
			else if (answer.equals("Y")
						|| answer.equals("yes")
						|| answer.equals("t")
						|| answer.equals("true")
						|| answer.equals("Yes")
						|| answer.equals("True")
						|| answer.equals("TRUE")
						|| answer.equals("YES")
						|| answer.equals("Y")
						|| answer.equals("Y")) {
				return answer;
				}//close if
			
			else {//open else
				
				JOptionPane.showMessageDialog(null,"Invalid answer. Please enter TRUE\r\n"
						+ "or FALSE.");
					
			}//close else
			
				
		}//close while loop
		
		
	}
	
	
}

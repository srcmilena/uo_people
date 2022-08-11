import javax.swing.JOptionPane;
public class MultipleChoiceQuestion extends Question {
	

	        //-----------**constructor**---------------//
	
	
	MultipleChoiceQuestion(String query, String a, String b, String
			c, String d, String e, String answer) {//open
		
		question = query+"\n";
		
		question += "A. " +a+ "\n";
		question += "B. " +b+ "\n";
		question += "C. " +c+ "\n";
		question += "D. " +d+ "\n";
		question += "E. " +e+ "\n";
		
		
		correctAnswer = answer;
		correctAnswer = correctAnswer.toUpperCase();
			
	}//close constructor

			@Override
			
			String ask() {
					
				

			while(true) {//open while loop
				
				String answer = JOptionPane.showInputDialog(question);
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
					correctAnswer = "FALSE";
				}
					
					
				else if (answer.equals("f")
							|| answer.equals("y")
							|| answer.equals("yes")
							|| answer.equals("t")
							|| answer.equals("true")
							|| answer.equals("Yes")
							|| answer.equals("True")
							|| answer.equals("TRUE")
							|| answer.equals("YES")
							|| answer.equals("Y")
							|| answer.equals("Y")) {
					correctAnswer = "TRUE";
					}//close if
				
				else {//open else
					
					JOptionPane.showMessageDialog(null,"Invalid answer. Please enter TRUE\r\n"
							+ "or FALSE.");
						
				}//close else
				
			}//close while loop
			}

		
		
		
		
	//------------------------------------------------------------------//


		
}//close MultipleChoiceQuestion class 

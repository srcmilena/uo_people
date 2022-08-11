import javax.swing.JOptionPane;

public abstract class Question {//open class


         //--------------**declaring variables**-------------------//
		
		static int nQuestions = 0;
		static int nCorrect = 0;
		String question;
		String correctAnswer;
		
		// add abstract declaration method**
		
		abstract String ask();   
		
		
		
		
		//--------------------**check method**-----------------------//
		
	void check() {//open check
		
		nQuestions++;
			
		String answer = ask();
			
		if (answer.equals(correctAnswer)) {//open if
				
				JOptionPane.showMessageDialog(null,"Correct!");
				nCorrect++;
			}//close if
			
		else{//open else
				JOptionPane.showMessageDialog(null,"Incorrect!"
						+ " The correct Answer is "+correctAnswer);}
				
			}//close else
		
			
		             // ------check method End------//
	
	
		
		
	//--------------------------**Show Results**-------------------------//
		
		static void showResults() {//open showResults
			
			JOptionPane.showMessageDialog(null,"You answered "+nQuestions
					+ " questions\nCorrect out of questions "+nCorrect);
			
		}//close showResults
	
	
		
		
			

	}//close class



package default_package;

public class Quiz {
		

	public static void main(String[] args) {
		Question q1 = new TrueFalseQuestion("the sky is blue", "true");
		q1.check();
		Question q2 = new TrueFalseQuestion("2+2=5", "false");
		q2.check();
		Question q3 = new TrueFalseQuestion("Stoves are hot", "true");
		q3.check();
		Question q4 = new TrueFalseQuestion("the square root of 49 is 7", "true");
		q4.check();
		Question q5 = new TrueFalseQuestion("infinity divide by 0 is 3", "false");
		q5.check();
				
		TrueFalseQuestion.showResults();
		
				}//end loop
	
		}//end main
	

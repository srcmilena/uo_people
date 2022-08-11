
public class Quiz {
	
	
	 //------------       //main method//     -----------------//
	
	public static void main(String[] args) { //open main
		
		
		
		Question question = new TrueFalseQuestion("In jave, || means \"and\".", "FALSE"
				+ "");
		
		question.check();
		Question question1 = new TrueFalseQuestion("Interfaces can be instantiated.", "FALSE");
		question1.check();
		Question question2 = new TrueFalseQuestion("class file contains bytecodes?", "TRUE");
		question2.check();
		Question question3 = new TrueFalseQuestion("Constructor overloading is not possible in Java.", "FALSE");
		question3.check();
		Question question4 = new TrueFalseQuestion("jave is a compiled language.","TRUE");
		question4.check();
		
		Question.showResults();
		
		
	}//close main method
		
}// Quiz class

  //-------------------------End of Quiz class---------------------------//


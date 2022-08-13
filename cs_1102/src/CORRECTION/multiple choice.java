import javax.swing.JOptionPane;

public class MultipleChoiceQuestion {
	static int nQuestions = 0;
	static int nCorrect = 0;
	String question;
	String correctAnswer;
	MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
		question = query+"\n";        
		question += "A. "+a+"\n";
		question += "B. "+b+"\n";
		question += "C. "+c+"\n";
		question += "D. "+d+"\n";
		question += "E. "+e+"\n";
		correctAnswer = answer.toUpperCase();
	}
	public MultipleChoiceQuestion(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8) {
		// TODO Auto-generated constructor stub
	}
	String ask() {
		while (true) {
	           String answer = JOptionPane.showInputDialog(question);
	           answer = answer.toUpperCase();
	           boolean valid = (answer.equals("A") || answer.equals("B") ||
	        		   answer.equals("C") || answer.equals("D") || answer.equals("E"));
	        		              if (valid) return answer;
	        		              JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
		}
	}
		void check() {
		       nQuestions++;
		       String answer = ask();
		       if (answer.equals(correctAnswer)) {
		           JOptionPane.showMessageDialog(null,"Correct!");
		           nCorrect++;
		       } else {
		           JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is "+correctAnswer+".");
		       }

}
	static void showResults() {
	       JOptionPane.showMessageDialog(null,nCorrect+" correct out of"+nQuestions+" questions");
	   }
	

public static void main(String[] args) {

	
	MultipleChoiceQuestion question = new MultipleChoiceQuestion( "What is a quiz?",
			"a test of knowledge, especially a brief informal test given to students",
			         "42",
			         "a duck",
			         "to get to the other side",
			         "To be or not to be, that is the question.",
			         "a");
	question.check(); MultipleChoiceQuestion.showResults();
	
	MultipleChoiceQuestion question1 = new MultipleChoiceQuestion( "What is a depression?",
			"Kind of mentalillness",
			         "Can make you suicide",
			         "Cry at the corner",
			         "Want to leave this world",
			         "I hate everything.",
			         "b");
	question1.check(); MultipleChoiceQuestion.showResults();
	
	MultipleChoiceQuestion question2 = new MultipleChoiceQuestion( "Who is your crush?",
			"Kyaw Kyaw",
			         "Mg Mg",
			         "Nyi Nyi",
			         "Thar Sit",
			         "Sai Sai.",
			         "c");
	question2.check(); MultipleChoiceQuestion.showResults();
	
	MultipleChoiceQuestion question3 = new MultipleChoiceQuestion( "What is your feeling right now?",
			"Happy",
			         "Sad",
			         "Angryr",
			         "Sick",
			         "Depress.",
			         "d");
	question3.check(); MultipleChoiceQuestion.showResults();
	
	MultipleChoiceQuestion question4 = new MultipleChoiceQuestion( "What is favortite food?",
			"Burger",
			         "Pancake",
			         "Sandwishes",
			         "Steak",
			         "Pasta.",
			         "e");
	question4.check(); MultipleChoiceQuestion.showResults();
	
	
}}

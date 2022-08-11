import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {
	String ask() {
		while (true) {
			String answer=JOptionPane.showInputDialog(question);
			answer=answer.toUpperCase();
			if(answer.equals("T") ||(answer.equals("Y") ||(answer.equals("YES")||(answer.equals("TRUE")))))answer= "TRUE";
			if(answer.equals("N") ||(answer.equals("NO") ||(answer.equals("F")||(answer.equals("FALSE")||(answer.equals("F"))))))answer= "FALSE";
			
			boolean valid= (answer.equals("TRUE")||(answer.equals("FALSE")));
			if (valid)
				return answer;
			JOptionPane.showMessageDialog(null, "INVALID ANSWER PLEASE ENTER ENTER TRUE OR FALSE");
			}
		}
	TrueFalseQuestion(String question, String answer){
		super.question = "TRUE or FALSE " + question;
		answer=answer.toUpperCase();
		if(answer.equals("T") ||(answer.equals("Y") ||(answer.equals("YES")||(answer.equals("TRUE")))))
			correctAnswer = "TRUE";
		if(answer.equals("N") ||(answer.equals("NO") ||(answer.equals("F")||(answer.equals("FALSE")||(answer.equals("F"))))))
		
			correctAnswer = "FALSE";
	}

}

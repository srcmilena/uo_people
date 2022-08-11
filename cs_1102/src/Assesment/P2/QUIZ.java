public class QUIZ {

		public static void main(String[] args) {
				MultipleChoiceQuestion question1 = new MultipleChoiceQuestion("What is my marital status?","singe", "married", "unmarried", "widdowed","idont know","b");
					question1.check();
					
				MultipleChoiceQuestion question2 = new MultipleChoiceQuestion("What is my wife's name?","jemmima", "jane", "Mary", "Asha","idont know","b");
				question2.check();
				
				MultipleChoiceQuestion question3 = new MultipleChoiceQuestion("What is my wife's Age in years?","40", "30", "33", "54","60","c");
				question3.check();
				MultipleChoiceQuestion question4 = new MultipleChoiceQuestion("What is my wife's gender?","fem", "female", "male", "all","you","b");
			    question4.check();
			
			    MultipleChoiceQuestion question5 = new MultipleChoiceQuestion("What is my wfirst born's age?","15", "30", "33", "54","60","a");
			    question5.check();
				//true or false questions.
				Question question =new TrueFalseQuestion("Do you know my name" ,("Y"));
				question.check();
											
				Question question6 =new TrueFalseQuestion("Do you know my wife" ,("N"));
				question6.check();
				
				Question question7 =new TrueFalseQuestion("Do you know my children" ,("N"));
				question7.check();
				
				Question question8 =new TrueFalseQuestion("Do you know my parents" ,("Y"));
				question8.check();
				
				Question question9 =new TrueFalseQuestion("Do you know my siblings" ,("N"));
				question9.check();
				
				Question question10 =new TrueFalseQuestion("Do you know my home" ,("Y"));
				question10.check();
				
				question.showResults();

		}
}//1end of the program quiz

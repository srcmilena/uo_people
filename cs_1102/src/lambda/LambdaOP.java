package lambda;

import java.util.function.*;

public class LambdaOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Validator validator = new Validator();
		String city = "NewYork";
		boolean isValid = validator.isDataValid(city, (String info) -> {
			String regx = "^[a-zA-Z0-9]*$";
			return info.matches(regx);
		});
		System.out.println("the value returned from lambda is: " + isValid);
	}
	
	private static class Validator {
		public boolean isDataValid(String data, Predicate<String> predicate) {
			return predicate.test(data);
		}
	}

}

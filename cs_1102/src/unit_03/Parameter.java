package unit_03;

public class Parameter {
	
	public static void verification (String name) {
		
		if (name.equals("Milena")) {
			System.out.print("This is my name");
		} else {
			System.out.print("This is not my name");
		}
	}

	public static void main(String[] args) {
		verification ("Milena");
	}
}

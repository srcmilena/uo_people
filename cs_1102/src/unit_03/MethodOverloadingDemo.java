package unit_03;

public class MethodOverloadingDemo {
	
	/*
	 * The main method
	 * @param args (param's name)
	 * */

	public static void main(String[] args) { //@param args
		// TODO Auto-generated method stub

		System.out.println(add(1, 2));
		System.out.println(add(1, 2, 3));
		System.out.println(add("Hello", "world"));
	}
	
	/*
	 * this methhod will sum up two integers
	 * @param a the first integer
	 * @param b the second integer
	 * @return the sum of a and b
	 * */
	
	public static int add(int a, int b) { //int, int
		return a + b;
	}
	
	/*
	 * this is the add method that takes 3 integers
	 * */
	public static int add(int a, int b, int c) { //int, int, int
		return a + b + c;
	}
	
	/*
	 * @param a first string
	 * @param b 2nd string
	 * @return the two strings combined
	 * */
	
	public static String add(String a, String b) { //String, String
		return a + b;
	}
	

}

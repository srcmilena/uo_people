package unit_03;

public class VariableScope {

	public static void main(String[] args) {
		
		SayHello("Mike");
		SayHello("Dave");

	}
	
	public static void SayHello(String name) {
		System.out.printf("Hello, %s\n", name);
	}
}

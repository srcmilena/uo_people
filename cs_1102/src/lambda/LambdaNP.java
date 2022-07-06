package lambda;

@FunctionalInterface
interface Statement {
	public String greet();
}

public class LambdaNP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statement s = () -> {
			return "Hello world. Welcome to Simplilearn.";
		};
		System.out.println(s.greet());

	}

}

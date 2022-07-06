package lambda;

import java.util.*;

public class LambdaFEL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		list.add("Kiwi");
		list.add("Guawa");
		
		list.forEach(
				(n) -> System.out.println(n)
				);
	}

}

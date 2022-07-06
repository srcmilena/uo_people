package lambda;

import java.util.Scanner;
import java.lang.FunctionalInterface;

@FunctionalInterface
interface MyInterface {
	double getPiValue();
}

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner kb = new Scanner(System.in)) {
			System.out.println("Enter the value of radius");
			int r = kb.nextInt();
			
			MyInterface ref;
			
			ref = () -> 3.1415;
			
			System.out.println("Area of circle with given radius is = " + r * r * ref.getPiValue());
		}

	}

}

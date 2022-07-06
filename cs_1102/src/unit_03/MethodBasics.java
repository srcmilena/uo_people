package unit_03;

import java.util.Scanner;

public class MethodBasics {

	public static void main(String[] args) { // method named as main that returns void/nothing
		// static = do not need to declare an object of this class method basics in order to use this method
		
		// it is public, which means it is accessible to use outside of the class name method basics 
		
		int length, width;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length: ");
		length = input.nextInt();
		
		System.out.print("Enter the width: ");
		width = input.nextInt();
		int area = rectangleArea(length, width);
		int per = rectanglePerimeter(length, width);
		System.out.printf("Rectangle area: %d; Perimeter: %d\n", area, per);
		
		//System.out.println(rectangleArea(5, 10)); // method call
		// arguments(5, 10) = real values
		
	}

	public static int rectangleArea(int someLenght, int someWidth) {
		// static because it is inside of the class name method basics 
		
		return someLenght * someWidth;
		
	}
	
	public static int rectanglePerimeter(int someLenght, int someWidth) {
		return 2 * (someLenght + someWidth);
	}
}

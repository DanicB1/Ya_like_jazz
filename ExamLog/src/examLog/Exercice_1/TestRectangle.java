package examLog;

import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of 'a': ");
		float a = sc.nextFloat();
		System.out.println("Enter the value of 'b': ");
		float b = sc.nextFloat();
		
		Rectangle r = new Rectangle(a, b);
		
		System.out.print("The surface of the rectangle is: ");
		System.out.println(r.surface());
	}

}

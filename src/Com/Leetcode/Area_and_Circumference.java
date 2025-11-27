package Com.Leetcode;

import java.util.Scanner;

public class Area_and_Circumference {

	public static void main(String[] args) {
		System.out.printf("The area and circumference of circle");
		Scanner sc= new Scanner(System.in);
		System.out.printf("Enter Redius");
		
		float Radius=sc.nextFloat();
		int area;
		double circumference;
		
		area=(int) (3.14159*(Radius*Radius));
		
		System.out.println("The Redius of Circle is:"+area);
		
		
		 circumference = 2 * 3.14159 * Radius;

		 System.out.printf("The Circumference of Circle is:"+circumference);
	}

}

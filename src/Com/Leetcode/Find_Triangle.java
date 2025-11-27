package Com.Leetcode;

import java.util.Scanner;

public class Find_Triangle  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the 3 Sides Of Triangle");
		
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		
		if(a==b && b==c) {
			System.out.println("This is Equilateral Triangle");
		}else if(a==b || b==c)	{
			System.out.println("This is Isosceles Triangle");
		}else {
			System.out.println("This is Scalene Triangle");
		}

	}

}

package Com.Leetcode;

import java.util.Scanner;

public class validTrang {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter the 3 side of Trangle");
		System.out.printf("Enter the side A");
		int a=sc.nextInt();
		
		System.out.printf("Enter the side B");
		int b=sc.nextInt();
		
		System.out.printf("Enter the side C");
		int c=sc.nextInt();
		 
		int vtrang=180;
		int result=a+b+c;
		
		if(vtrang==result) {
			System.out.println("This is valid Trangel");

		}else {
			System.out.println("This  is not Valid Trangel");

		}		
		sc.close();
	}

}

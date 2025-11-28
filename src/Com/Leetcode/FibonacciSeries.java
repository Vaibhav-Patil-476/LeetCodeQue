package Com.Leetcode;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");

		
		int num=sc.nextInt();
		int a=0;
		int b=1;
		int term;
		
		
		for(int i=1;i<=num;i++) {
			System.out.print(a + " ");

			term =a+b;
			a=b;
			b=term;
			

		}
	}

}

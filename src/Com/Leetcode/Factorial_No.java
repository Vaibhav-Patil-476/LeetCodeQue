package Com.Leetcode;

import java.util.Scanner;

public class Factorial_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for find Fact:");
		
		int num=sc.nextInt();
		
		System.out.println("The Fact of give number:");
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i + " ");
			}
		}
	}

}

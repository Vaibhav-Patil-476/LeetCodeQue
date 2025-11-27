package Com.Leetcode;

import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Factorial_Number");
		int num=sc.nextInt();
		int fact = 1;
		while(num>0) {
			fact=fact*num;
			num--;	
		}
		System.out.println("The fact number is "+fact);
	}

}

package Com.Leetcode;

import java.util.Scanner;

public class SumOfFirstNOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numer For Sum of N Odd Number");
		int num=sc.nextInt();
		
		int sum=0;
		
		for(int i=1;i<=num;i++) {
			sum=sum+(2*i-1);
		}

		System.out.println("The Sum of First N Odd Number is:"+sum);

		
	}


}

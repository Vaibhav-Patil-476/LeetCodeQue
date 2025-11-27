package Com.Leetcode;

import java.util.Scanner;

public class N_NaturalNumberCalcukation {

	public static void main(String[] args) {
		
		System.out.println("The N Natural Numbe");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number Which you Want to Calculate Natural Number");
		int num=sc.nextInt();
		int i;
		int sum=0;
		
		for(i=1;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("The Total of N natural number is:"+sum);
	}
}

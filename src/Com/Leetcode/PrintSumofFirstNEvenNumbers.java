package Com.Leetcode;

import java.util.Scanner;

public class PrintSumofFirstNEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want sum of n number");
		
		int num=sc.nextInt();
		
		int sum = 0;
		
		for(int i=1;i<=num;i++) {
			sum=sum+(2*i);
		}
		System.out.println("The sum of First Number is:"+sum);


	}

}

package Com.Leetcode;

import java.util.Scanner;

public class Sum_of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ");

		
		int num=sc.nextInt();
		int sum=0;
		
		for(int i=0;i<=num;i++) {
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("The Sum of Given Number is"+sum);

	}

}

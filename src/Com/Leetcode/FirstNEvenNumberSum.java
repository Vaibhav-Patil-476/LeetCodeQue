package Com.Leetcode;

import java.util.Scanner;

public class FirstNEvenNumberSum {

	public static void main(String[] args) {
		
		System.out.println("The Sum Of N Even Numbe");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number Which you Want to Calculate N Sum Of Even Number");
		int num=sc.nextInt();
		int i;
		int sum=0;
		
		 
		for(i=1;i<=num;i++) {
		
			sum=sum+i;
		
		}
		System.out.println("The Total of N natural number is:"+sum);
		
	}
}

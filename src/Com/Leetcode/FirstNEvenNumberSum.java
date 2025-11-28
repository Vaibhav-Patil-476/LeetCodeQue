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
		int number=2;
		
		 
		for(i=1;i<=num;i++) {
			sum+=number;
			number+=2;
		
		}
		System.out.println("The Total of N natural number is:"+sum);
		
	}
}

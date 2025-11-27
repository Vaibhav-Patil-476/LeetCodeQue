package Com.Leetcode;

import java.util.Scanner;

public class Armstrong_Number_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");

		
		int num=sc.nextInt();
		int orignal=0;
		int sum=0;
		
		while(num>0) {
			int digit=num%10;
			sum=sum+(digit*digit*digit);
			num=num/10;
		}
		if(num==orignal) {
			System.out.println("This is Amstrom Number"+sum);

		}else {
			System.out.println("This is Not Amstrom Number"+sum);

		}
	}

}

package Com.Leetcode;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Palindrome_Number");

		
		int num=sc.nextInt();
		int orignalnum=num;
		
		int rev=0;
		
		while(num > 0) {
		    int digit = num% 10;     
		    rev = rev * 10 + digit; 
		    num = num / 10;            
		}
		if(orignalnum==rev) {
		System.out.println("This number is Palindrome Numbber"+rev);
	
		}else {
			System.out.println("This number is not Palindrome Numbber"+rev);
		}

		
	}

}

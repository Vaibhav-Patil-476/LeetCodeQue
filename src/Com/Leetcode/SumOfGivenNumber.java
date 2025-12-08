package Com.Leetcode;

import java.util.Scanner;

public class SumOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num =Sc.nextInt();   
		int sum = 0;      

		while(num > 0) {
		    int digit = num % 10;  
		    sum = sum + digit;     
		    num = num / 10;        
		}

		System.out.println(sum);

	}

}

package Com.Leetcode;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		        int num =sc.nextInt();
		        int sum=0;
		        for(int i = 1; i < num; i++) {
		            if(num % i == 0) 
		            sum += i;
		        }

		        if(num==sum) {
		        	System.out.println("This is Perfect Number:"+num);
		        }else {
		        	System.out.println("This is not Perfect Number:"+num);
		        }
	}

}

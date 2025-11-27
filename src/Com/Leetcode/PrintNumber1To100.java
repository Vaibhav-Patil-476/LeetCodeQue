package Com.Leetcode;

import java.util.Scanner;

public class PrintNumber1To100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number");
		
		int num=sc.nextInt();
		int i;
		
		for(i=num;i<=100;i++) {
			System.out.println("Output :"+i);
		}

	}

}

package Com.Leetcode;

import java.util.Scanner;

public class Pattern_Right_Triangel {

	public static void main(String[] args) {
		//user input scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want...!");
		
		int num=sc.nextInt();
		
		//for outer loop 
		for(int i=1;i<=num;i++) {
			//inner loop
			for(int j =1; j<=i;j++) {
				//print * pattern 
				System.out.print("*");
			}
			//blank space 
			System.out.println("");
		}

	}

}

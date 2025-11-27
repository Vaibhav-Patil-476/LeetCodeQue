package Com.Leetcode;

import java.util.Scanner;

public class Multiplication_N_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");

		int num=scanner.nextInt();
		System.out.println("The Multiplication Table is :");
		
		for(int i=1;i<=10;i++) {
			System.out.println(num + " * " + i + " = " + (num*i) );
		}
	}
}

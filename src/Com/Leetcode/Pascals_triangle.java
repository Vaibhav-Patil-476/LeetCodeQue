package Com.Leetcode;

import java.util.Scanner;

public class Pascals_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int num=sc.nextInt();
		
		
		for(int i=0;i<num;i++) {
			int value=1;
			for(int j=0;j<=i;j++) {
				System.out.print(value+" ");
				value = value * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}

}

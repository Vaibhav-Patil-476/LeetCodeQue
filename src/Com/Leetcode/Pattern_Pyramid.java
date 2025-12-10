package Com.Leetcode;

import java.util.Scanner;

public class Pattern_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int num=sc.nextInt();
		
		//for outer loop 
				for(int i=1;i<=num;i++) {
					
					for(int j=1;j<=num-i;j++) {
						System.out.print(" ");
					}
						
						for(int k=1;k<=(2*i-1);k++) {
							System.out.print("*");
					}
						
				System.out.println();	
					
				}
				
	}

}

package Com.Leetcode;

import java.util.Scanner;

public class GCD {

	public static void main(String args[]) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int r;
		
		while(b!=0) {
			r=a%b;
			a=b;
			b=r;
		}
		System.out.println("The GCD is given number:"+a);
	}
}

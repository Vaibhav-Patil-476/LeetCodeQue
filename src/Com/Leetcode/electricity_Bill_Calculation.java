package Com.Leetcode;

import java.util.Scanner;

public class electricity_Bill_Calculation {
	public static void main(String [] args) {
Scanner sc = new Scanner(System.in);
	System.out.print("Enter the unit:");
	
	int unit = sc.nextInt();
	double rate=0,bill;
	
	if(unit<=100) {
		rate=1.5;
	}else if(unit<=200) {
		rate=2.5;
	}else if (unit<=300) {
		rate=3.5;
	}else if(unit<=400) {
		rate=4.5;
	}
	bill=rate*unit+50;
	System.out.printf("The total Bill is:"+bill);
	
}
}

package Com.Leetcode;

import java.util.Scanner;

public class AbsoluteValueofNumbe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbber");
		int num=sc.nextInt();
		
		int Absvalue;
		
		if(num<0) {
			Absvalue = -num;
			System.out.println("Output:"+Absvalue);
		}else {
			Absvalue=num;
			System.out.println("Output:"+Absvalue);
		}
	}

}

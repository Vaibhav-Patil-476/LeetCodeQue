package Com.Leetcode;

import java.util.Scanner;

public class CalculaterUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create Scanner Object 
		Scanner sc=new Scanner(System.in);
		System.out.println("Calculater Using Switch Case");
		
		//User Choice
		 System.out.println("------ Calculator ------");
	     System.out.println("1. Addition");
	     System.out.println("2. Subtraction");
	     System.out.println("3. Multiplication");
	     System.out.println("4. Division");
	     System.out.println("5. Modulus");
	     
	     //User Input 
	     System.out.print("Enter your choice: ");
	     int ch=sc.nextInt();
		
		System.out.println("Enter Num1");
		int num1=sc.nextInt();
		
		System.out.println("Enter Num2");
		int num2=sc.nextInt();
		
		int result = 0;
		
		//Use Switch Case
		switch(ch){
		
		case 1:
			result= num1 + num2;
			System.out.println("The Addition is:"+result);
			break;
			
		case 2:
			result=num1-num2;
			System.out.println("The Subtraction is:"+result);
			break;
			
		case 3:
			result=num1*num2;
			System.out.println("The Multiplication is:"+result);
			break;
			
		case 4:
			 if(num2 == 0) {
                 System.out.println("Can't divide by zero");
			}else
			result=num1/num2;
			System.out.println("The Division is:"+result);
			break;
			
		case 5:
			result=num1%num2;
			System.out.println("The Modulus is:"+result);
			break;
			
		default:
				System.out.println("You Enter Wrong Input");			
		}
	}
}

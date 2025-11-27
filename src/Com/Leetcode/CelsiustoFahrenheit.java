package Com.Leetcode;

import java.util.Scanner;

public class CelsiustoFahrenheit {

	public static void main(String[] args) {
		System.out.printf("Enter Celsius ");
		Scanner sc = new Scanner(System.in);
		
		float celsisus=sc.nextFloat();
		
		float fahrenheit = (celsisus* 9/5) + 32;

		System.out.printf("The Fahrenheit is :"+fahrenheit);
		sc.close();
			}
	}


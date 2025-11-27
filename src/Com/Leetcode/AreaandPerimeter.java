package Com.Leetcode;

import java.util.Scanner;

public class AreaandPerimeter {

	public static void main(String[] args) {
		
		System.out.printf("The area of perimeter");
		
		Scanner sc=new Scanner(System.in);
		
		int length = sc.nextInt();
		int width = sc.nextInt();
		int area;
		int perimeter;
		
		area = length* width;
		
		System.out.println("The are of trangel"+area);
		
		perimeter=2*(length+width);

		System.out.printf("The Perimeter of trangel"+perimeter);
		
		sc.close();
				
	}

}

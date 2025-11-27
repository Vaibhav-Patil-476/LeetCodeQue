package Com.Leetcode;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.print("The first number is large: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.print("The second number is large: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.print("The third number is large: " + num3);
        } else {
            System.out.print("Some numbers are equal and highest.");
        }

        sc.close();
    }
}

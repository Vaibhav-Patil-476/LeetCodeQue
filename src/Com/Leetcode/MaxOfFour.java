package Com.Leetcode;
import java.util.Scanner;

public class MaxOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        System.out.print("Enter fourth number: ");
        int num4 = sc.nextInt();


        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num4 > max) {
            max = num4;
        }

    
        System.out.print("Among all the numbers, this one has the highest value: " + max);

        sc.close();
    }
}

package Com.Leetcode;

import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal (P): ");
        double p = sc.nextDouble();

        System.out.println("Enter Rate (R): ");
        double r = sc.nextDouble();

        System.out.println("Enter Time (T): ");
        double t = sc.nextDouble();

      
        double si = (p * r * t) / 100;
        System.out.println("The Simple Interest is: " + si);

        double ci = p * Math.pow((1 + r / 100), t) - p;
        System.out.println("The Compound Interest is: " + ci);

        sc.close();
    }
}

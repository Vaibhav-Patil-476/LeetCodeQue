package Com.Leetcode;

import java.util.Scanner;

public class Profit_Loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost Price: ");
        int cost = sc.nextInt();

        System.out.print("Enter Selling Price: ");
        int selling = sc.nextInt();

        if (selling > cost) {
            int profit = selling - cost;
            System.out.println("Profit: " + profit);
        } else if (selling < cost) {
            int loss = cost - selling;
            System.out.println("Loss: -" + loss);
        } else {
            System.out.println("No Profit No Loss");
        }

        sc.close();
    }
}

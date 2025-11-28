package Com.Leetcode;

public class Prime_Number {

    public static void main(String[] args) {

        int count = 0;  
        int num = 2;   

        while (count <= 100) {  
            boolean prime = true;
            if (num <= 1) {
                prime = false;
            } else {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        prime = false;
                        break;
                    }
                }
            }
            if (prime) {
                System.out.print(num + " ");
                count++;  
            }
            num++;    
        }
    }
}

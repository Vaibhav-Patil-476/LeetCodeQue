package Com.Leetcode;

class profit {
    public int maxProfit(int[] prices) {
        int min = prices[0];       
        int maxProfit = 0;         

        for (int price : prices) {
            if (price < min) {
                min = price;       
            } else if (price - min > maxProfit) {
                maxProfit = price - min;  
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        profit sol = new profit();
        System.out.println("Maximum Profit: " + sol.maxProfit(prices));
    }
}

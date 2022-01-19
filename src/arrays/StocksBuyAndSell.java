package arrays;

public class StocksBuyAndSell {

    // Naive Solution
    public static int maxProfit(int[] price, int start, int end) {
        if(end <= start)
            return 0;
        int profit = 0;
        for(int i=start; i<end; i++) {
            for(int j=i+1; j<=end; j++) {
               // if next value is greater, then only we will sell the stock
                if(price[j] > price[i]) {
                    // recursively calling on remaining array
                    int currProfit = price[j] - price[i] + maxProfit(price, start, i-1)
                            + maxProfit(price, j+1, end);
                    profit = Math.max(profit, currProfit);
                }
            }
        }
        return profit;
    }

    // Efficient Solution
    public static int maxProfitEff(int[] price) {
        int profit = 0;
        for(int i=1; i<price.length; i++) {
            // if next value is greater, then only we will sell the stock
            if(price[i] > price[i-1])
                profit += (price[i] - price[i-1]);
        }
        return profit;
    }

    public static void main(String[] args) {
        System.out.println("Max Profit Naive : " + maxProfit(new int[] {1, 5, 3, 8, 12}, 0, 4));
        System.out.println("Max Profit Efficient : " + maxProfitEff(new int[] {10,20,30}));
        System.out.println("Max Profit Efficient : " + maxProfitEff(new int[] {1,5,3,1,2,8}));
    }
}

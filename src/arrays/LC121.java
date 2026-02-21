package arrays;

public class LC121 {
    public static int maxProfit(int[] prices) {
        int[] bestSell = new int[prices.length];
        bestSell[prices.length - 1] = prices[prices.length - 1];

        for (int i = prices.length-2; i >= 0; i--) {
            if(prices[i] > bestSell[i+1]) bestSell[i] = prices[i];
            else bestSell[i] = bestSell[i+1];
        }

        int maxProfit = 0;
        for(int i = 0; i < bestSell.length; i++) {
            int curProfit = bestSell[i] - prices[i];
            maxProfit = Math.max(maxProfit, curProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}

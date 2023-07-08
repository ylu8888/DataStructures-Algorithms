//Best Time to Buy and Sell Stock
class BestStock {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 0;
        int max = 0;
        int profit = 0;

        while(right < prices.length){   //sliding window
            if(prices[right] < prices[left]){    //left is lowest price to buy
                left = right;
                max = 0;    //set max to 0 after finding new low
            }

            max = Math.max(max, (prices[right]));   //max is highest price to sell
            profit = Math.max(profit, max-prices[left]);    
            right++;
        }

        return profit;
    }
}

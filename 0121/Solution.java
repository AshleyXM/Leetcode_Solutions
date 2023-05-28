class Solution {
    public int maxProfit(int[] prices) {
        // We CANNOT use violent solution, like double nested loops, to solve this problem
        // because it will exceed the time limit
        // Infeasible violent solution:
        // int max = 0;
        // for(int i = 0; i < prices.length; i++) {
        //     for(int j = i + 1; j < prices.length; j++) {
        //         if(prices[j] - prices[i] > max)
        //             max = prices[j] - prices[i];
        //     }
        // }
        // return max;

        int min = prices[0];
        int profit = 0; // initiate the profit with the minimal value
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
            } else if(prices[i] - min > profit) {
            // the maximum profit must be the difference between the current value and the minumal value before the current element
                profit = prices[i] - min;
            }
        }
        return profit;
    }
}
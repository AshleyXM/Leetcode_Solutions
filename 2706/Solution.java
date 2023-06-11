class Solution {
    public int buyChoco(int[] prices, int money) {
        // Solution 1: Use the method in Arrays to sort
        // Arrays.sort(prices);
        // return (money - prices[0] - prices[1] >= 0) ? money - prices[0] - prices[1]: money;

        // Solution 2: Find the two minimal numbers
        int min1 = 100; // the smallest number
        int min2 = 100; // the second smaller number
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < min1) {
                min2 = min1;
                min1 = prices[i];
            } else if(prices[i]>= min1 && prices[i] < min2) {
                min2 = prices[i];
            }
        }
        return (money - min1 - min2 >= 0) ? money - min1 - min2: money;
    }
}
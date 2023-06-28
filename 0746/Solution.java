class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // Solution 1: Time complexity: O(n), space complexity: O(n)
        // int[] dp = new int[cost.length + 1];
        // dp[0] = cost[0];
        // dp[1] = cost[1];
        // for(int i = 2; i < cost.length + 1; i++) {
        //     int tmp = (i == cost.length) ? 0 : cost[i];
        //     dp[i] = Math.min(dp[i - 2], dp[i - 1]) + tmp;
        // }
        // return dp[cost.length];

        // Solution 1 plus: Time complexity: O(n), space complexity: O(1)
        int size = cost.length;
        for(int i = 2; i < cost.length; i++) {
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }
        return Math.min(cost[size - 1], cost[size - 2]);
    }
}
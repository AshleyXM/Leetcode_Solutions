class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length]; // dp: dynamic programming
        dp[0] = nums[0];
        if(nums.length >= 2) // if there are more than one elements
            dp[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < nums.length; i++) { // the maximum value of current dp should be either dp[i - 2] + nums[i], or dp[i - 1]
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }
}
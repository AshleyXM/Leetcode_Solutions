class Solution {
    public boolean stoneGame(int[] piles) {
        int len = piles.length;
        int[][] dp = new int[len][len]; // dp: the max value difference can be reached
        for(int i = 0; i < len; i++) {
            dp[i][i] = piles[i];
        }
        for(int i = 0; i < len; i++) {
            for(int j = i + 1; j < len; j++) {
                dp[i][j] = Math.max(piles[i] - dp[i + 1][j], piles[j] - dp[i][j - 1]);
            }
        }
        if(dp[0][len - 1] > 0) {
            return true;
        }
        return false;
    }
}
class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[1] = dp[0] = 1;
        int res = 0;
        for(int i = 2; i <= n; i++) {
            // G(n) = sum(G(i - 1) * G(n - i)), i ∈ (1, n)
            for(int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }
}
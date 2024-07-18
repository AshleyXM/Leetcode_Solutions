class Solution {
    public int uniquePaths(int m, int n) {
        // method 1: combination
        // 从左上角到右下角一共要走 (m - 1) + (n - 1) = m + n - 2 步，
        // 选择 (m - 1) 步向下走/(n - 1) 步向右走
        // long ans = 1;
        // for(int x = n, y = 1; y < m; x++, y++) {
        //     ans = ans * x / y;
        // }
        // return (int)ans;

        // 注意method 1里若是把三个阶乘先求出来，会出现数值溢出的情况，因此不佳

        // method 2: dynamic programming
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for(int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
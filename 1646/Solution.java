class Solution {
    public int getMaximumGenerated(int n) {
        if(n <= 1)
            return n;
        int[] res = new int[n + 1];
        res[0] = 0;
        res[1] = 1;
        int max = res[1];
        for(int i = 2; i <= n; i++) {
            if(i % 2 == 0) {
                res[i] = res[i / 2];
            } else {
                res[i] = res[i / 2] + res[i / 2 + 1];
                max = Math.max(max, res[i]);
            }
        }
        return max;
    }
}
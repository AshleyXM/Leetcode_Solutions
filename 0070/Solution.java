class Solution {
    public int climbStairs(int n) {
        // DO NOT use recursive method because time limit will exceed
        int[] res = new int[46]; // leave the first element alone
        res[1] = 1;
        res[2] = 2;
        for(int i = 3; i < 46; i++) {
            res[i] = res[i-1] + res[i-2];
        }
        return res[n];
    }
}
// This method uses HashMap to expedite the searching process
class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int len = arr.length;
        int max = 0;
        int[][] dp = new int[len][len];
        Map<Integer, Integer> indices = new HashMap<>(); // used to expedite the searching process
        indices.put(arr[0], 0);
        indices.put(arr[1], 1);
		/*
        for(int i = 2; i < len; i++) {
            indices.put(arr[i], i);
            for(int j = i - 1; j >= 1; j--) { // can be optimized a little bit more as follows
                int index = indices.getOrDefault(arr[i] - arr[j], -1);
                if(index != -1 && index < j) {
                    dp[j][i] = Math.max(3, dp[index][j] + 1);
                    if(dp[j][i] > max) {
                        max = dp[j][i];
                    }
                }
            }
        }*/
		for(int i = 2; i < len; i++) {
            indices.put(arr[i], i);
            for(int j = i - 1; j >= 1; j--) {
                if(arr[i] >= 2 * arr[j]) { // optimize a little bit more
                    break;
                }
                int index = indices.getOrDefault(arr[i] - arr[j], -1);
                if(index != -1) {
                    dp[j][i] = Math.max(3, dp[index][j] + 1);
                    if(dp[j][i] > max) {
                        max = dp[j][i];
                    }
                }
            }
        }
        return max;
    }
}
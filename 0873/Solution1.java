// In this method, I wrote the binary search method to search the target number manually
class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int len = arr.length;
        int max = 0;
        int[][] dp = new int[len][len];
        for(int i = 2; i < len; i++) {
            for(int j = i - 1; j >= 1; j--) {
                int index = find(arr, 0, j - 1, arr[i] - arr[j]);
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

    public int find(int[] arr, int low, int high, int target) {
        while(low <= high) {
            int middle = (low + high) / 2;
            if(arr[middle] > target) {
                high = middle - 1;
            } else if(arr[middle] < target) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
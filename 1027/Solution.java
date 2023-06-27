class Solution {
    public int longestArithSeqLength(int[] nums) {
        // Brute-force attack: Fix the first two numbers, and find how many more numbers can form a subsequence
        int max = 2;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                int diff = nums[j] - nums[i];
                int current = nums[j];
                int count = 2;
                for(int k = j + 1; k < nums.length; k++) {
                    if(nums[k] - current == diff) {
                        current = nums[k];
                        count++;
                    }
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        // The sum should be 1 + 2 + ... + nums.length
        for(int i = 0; i < nums.length; i++)
            sum += nums[i];
        return (1 + nums.length) * nums.length / 2 - sum;
    }
}
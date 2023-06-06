class Solution {
    public int maximizeSum(int[] nums, int k) {
        // Solution 1: Use the built-in function to get the maximum number in the array nums
        // Arrays.sort(nums);
        // int sum = nums[nums.length - 1] * k; // k times the maximum number in nums
        // sum += k * (k - 1) / 2;
        // return sum;
        
        // Solution 2: Use while loop to get the maximum number in the array nums
        int max = 0;
        for(int i = 0; i < nums.length; i++)
            if(nums[i] > max)
                max = nums[i];
        int sum = max * k; // k times the maximum number in nums
        sum += k * (k - 1) / 2;
        return sum;
    }
}
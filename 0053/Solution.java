class Solution {
    public int maxSubArray(int[] nums) {
        int pos = 0;
        int max = nums[0];
        int sum = 0;
        while(pos <= nums.length - 1) {
            if(sum + nums[pos] >= 0) {
                sum = sum + nums[pos];
                if(sum > max)
                    max = sum;
            } else { // once the sum of a sequence < 0, they will make no contribution to the value of max
                sum = 0;
                if(nums[pos] > max) // a larger negative appears
                    max = nums[pos];
            }
            pos++;
        }
        return max;
    }
}
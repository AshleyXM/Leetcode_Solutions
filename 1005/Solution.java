class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        int min = Math.abs(nums[0]);
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 0 && k > 0) {
                sum -= nums[i];
                k--;
            } else {
                sum += nums[i];
            }
            min = Math.min(min, Math.abs(nums[i]));
        }
        if(k % 2 == 1) sum -= 2 * min;
        return sum;
    }
}
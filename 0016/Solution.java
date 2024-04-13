class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest_sum = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k) {
                int current_sum = nums[i] + nums[j] + nums[k];
                if(Math.abs(current_sum - target) < Math.abs(closest_sum - target)) {
                    closest_sum = current_sum;
                }
                if(current_sum > target) {
                    k--;
                } else if(current_sum < target) {
                    j++;
                } else {
                    return target;
                }

            }
        }
        return closest_sum;
    }
}
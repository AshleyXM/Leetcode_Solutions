class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int max = 1;
        int tmp = 1; // the current number of consecutive elements
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1] + 1) {
                tmp++;
                if(tmp > max) {
                    max = tmp;
                }
            } else if(nums[i] != nums[i - 1]) {
                tmp = 1;
            }
        }
        return max;
    }
}
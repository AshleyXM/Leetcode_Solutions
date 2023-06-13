class Solution {
    public int removeDuplicates(int[] nums) {
        int distinct = 1;
        int cur = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != cur) {
                nums[distinct] = nums[i];
                distinct++;
                cur = nums[i];
            }
        }
        return distinct;
    }
}
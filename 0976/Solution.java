class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int pointer = nums.length - 1;
        while(pointer >= 2) {
            if(nums[pointer - 2] + nums[pointer - 1] > nums[pointer])
                return nums[pointer - 2] + nums[pointer - 1] + nums[pointer];
            else
                pointer--;
        }
        return 0;
    }
}
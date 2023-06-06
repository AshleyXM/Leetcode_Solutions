class Solution {
    public int[] sortedSquares(int[] nums) {
        // Solution 1: First sort, and then square
        // for(int i = 0; i < nums.length; i++) {
        //     if(nums[i] < 0)
        //         nums[i] = -nums[i];
        // }
        // Arrays.sort(nums);
        // for(int i = 0; i < nums.length; i++) {
        //     nums[i] = nums[i] * nums[i];
        // }
        // return nums;

        // Solution 2: First square each item, and then sort the array
        // for(int i = 0; i < nums.length; i++)
        //     nums[i] = nums[i] * nums[i];
        // Arrays.sort(nums);
        // return nums;

        // Solution 3: Make use of the feature of non-decreasing order
        int ph = 0;
        int pt = nums.length - 1;
        int[] res = new int[nums.length];
        int pres = nums.length - 1;
        while(ph <= pt) {
            if(nums[ph] * nums[ph] > nums[pt] * nums[pt]) {
                res[pres--] = nums[ph] * nums[ph];
                ph++;
            } else {
                res[pres--] = nums[pt] * nums[pt];
                pt--;
            }
        }
        return res;
    }
}
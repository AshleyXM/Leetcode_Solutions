class Solution {
    public int search(int[] nums, int target) {
        // two pointers: pointer head and pointer tail
        int ph = 0;
        int pt = nums.length - 1;
        while(ph <= pt) {
            int mid = (ph + pt) / 2;
            if(nums[mid] > target) {
                pt = mid - 1;
            } else if(nums[mid] < target) {
                ph = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
class Solution {
    public int search(int[] nums, int target) {
        int ph = 0;
        int pt = nums.length -1;
        if(target >= nums[0]) { // target is within the first range
            while(ph <= pt) {
                int mid = (ph + pt) / 2;
                if(nums[mid] == target) {
                    return mid;
                }
                if(nums[mid] < nums[ph] || target < nums[mid]) { // nums[pt] must be >= nums[ph]
                    pt = mid - 1;
                } else { // target > nums[mid]
                    ph = mid + 1;
                }
            }
        } else if(target <= nums[nums.length - 1]) { // target is within in the second range
            while(ph <= pt) {
                int mid = (ph + pt) / 2;
                if(nums[mid] == target) {
                    return mid;
                }
                if(nums[mid] > nums[pt] || target > nums[mid]) { // nums[pt] must be >= nums[ph]
                    ph = mid + 1;
                } else { // target < nums[mid]
                    pt = mid - 1;
                }
            }
        }
        return -1;
    }
}
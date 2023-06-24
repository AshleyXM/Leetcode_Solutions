class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) // only one element
            return nums[0];
        // more than one element in the array (head < tail)
        int head = 0; // the largest element in the array
        int tail = nums.length - 1; // the smallest element in the array
        if(nums[head] < nums[tail]) // in ascending order
            return nums[head];
        while(head < tail) { // the array has been rotated
            int mid = (head + tail) / 2;
            if(nums[mid] > nums[tail]) {
                head = mid;
            } else if(nums[mid] < nums[tail]) {
                tail = mid;
            }
            if(head + 1 == tail)
                return nums[tail];
        }
        return nums[tail]; // will never execute
    }
}
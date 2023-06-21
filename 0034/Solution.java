class Solution {
    public int[] searchRange(int[] nums, int target) {
        int head = 0;
        int tail = nums.length - 1;
        int[] res = new int[2];
        int mid = (head + tail) / 2;
        while(head <= tail) {
            mid = (head + tail) / 2;
            if(nums[mid] > target) tail = mid - 1;
            else if(nums[mid] < target) head = mid + 1;
            else break;
        }
        if(head <= tail) { // find the target
            head = mid;
            tail = mid;
            while(head >= 0) {
                if(nums[head] == target) head--;
                else break;
            }
            while(tail <= nums.length - 1) {
                if(nums[tail] == target) tail++;
                else break;
            }
            res[0] = head + 1;
            res[1] = tail - 1;
        } else { // did not find the target
            res[0] = -1;
            res[1] = -1;
        }
        return res;
    }
}
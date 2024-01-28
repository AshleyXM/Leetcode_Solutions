class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        int low = 0;
        int high = nums.length - 1;
        int index = -1; // the index of one of the target
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] < target) {
                low = mid + 1;
            } else if(nums[mid] > target) {
                high = mid - 1;
            } else {
                index = mid;
                break;
            }
        }
        if(index != -1) {
            int left = index, right = index;
            while(left > 0 && nums[left - 1] == target) {
                left--;
            }
            while(right < nums.length - 1 && nums[right + 1] == target) {
                right++;
            }
            for(int i = left; i <= right; i++) {
                res.add(i);
            }
        }
        return res;
    }
}
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        // 1. Brute Force
        // int count = 0;
        // for(int i = 0; i < nums.size(); i++) {
        //     for(int j = i + 1; j < nums.size(); j++) {
        //         if(nums.get(i) + nums.get(j) < target) {
        //             count++;
        //         }
        //         if(nums.get(i) + nums.get(j) >= target) {
        //             break;
        //         }
        //     }
        // }
        // return count;

        // 2. Binary Search
        int count = 0;
        for(int i = 0; i < nums.size(); i++) {
            int low = i + 1;
            int high = nums.size() - 1;
            int index = i;
            while(low <= high) {
                int mid = (low + high) / 2;
                if(nums.get(mid) < target - nums.get(i)) {
                    index = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            count += (index - i);
        }
        return count;
    }
}
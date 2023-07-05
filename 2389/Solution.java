class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        // Solution 1: Brute-force attack
        // Arrays.sort(nums);
        // int[] answer = new int[queries.length];
        // for(int i = 0; i < queries.length; i++) {
        //     int count = 0;
        //     int pointer = 0;
        //     int sum = nums[pointer++];
        //     while(sum <= queries[i] && pointer < nums.length) {
        //         count++;
        //         sum += nums[pointer++];
        //     }
        //     if(sum <= queries[i]) count++;
        //     answer[i] = count;
        // }
        // return answer;

        // Solution 2: Calculate the prefix sums for all elements and get each result via binary search
        // Arrays.sort(nums);
        // for(int i = 1; i < nums.length; i++) { // calculate the prefix sum for each element
        //     nums[i] += nums[i - 1];
        // }
        // int[] answer = new int[queries.length];
        // for(int i = 0; i < queries.length; i++) {
        //     int low = 0, high = nums.length - 1;
        //     while(low <= high) {
        //         int mid = (low + high) / 2;
        //         if(nums[mid] > queries[i]) {
        //             high = mid - 1;
        //         } else if(nums[mid] < queries[i]) {
        //             low = mid + 1;
        //             answer[i] = mid + 1;
        //         } else {
        //             answer[i] = mid + 1;
        //             break;
        //         }
        //     }
        // }
        // return answer;

        // Solution 2 plus: Simplify solution 2 by replacing the binary search with built-in function
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++) { // calculate the prefix sum for each element
            nums[i] += nums[i - 1];
        }
        int[] answer = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            // Arrays.binarySearch: returns index of the search key, if it is contained in the array,
            //                      else it returns (-(insertion point) - 1)
            int index = Arrays.binarySearch(nums, queries[i]);
            answer[i] = Math.abs(index + 1);
        }
        return answer;
    }
}
class Solution {
    public int minimumOperations(int[] nums) {
        // Solution 1: Solve it with HashSet
        Set<Integer> hashset = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0)
                hashset.add(nums[i]);
        }
        return hashset.size();

        // Solution 2: First sort the array, and then traverse it
        // Arrays.sort(nums);
        // int count = 0;
        // int current = nums[0];
        // if(current != 0) count++;
        // for(int i = 0; i < nums.length; i++) {
        //     if(nums[i] != current && nums[i] != 0) {
        //         current = nums[i];
        //         count++;
        //     }
        // }
        // return count;

        // Solution 3: Solve it with Heap (PriorityQueue)
        // Queue<Integer> pq = new PriorityQueue<>();
        // for(int num : nums)
        //     pq.offer(num); // offer() is similar to add(), but the latter one will throw IllegalStateException when no space is available in the queue; however, the former one will return false
        // int count = 0;
        // int current = pq.poll();
        // if(current != 0) count++;
        // while(pq.size() > 0) {
        //     int tmp = pq.poll();
        //     if(tmp != current && tmp != 0) {
        //         count++;
        //         current = tmp;
        //     }
        // }
        // return count;
    }
}
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Solution 0: Use data structure List to solve this problem -> Time Limit Exceeded
        // List<Integer> list = new ArrayList<Integer>();
        // for(int i = 0; i < nums.length; i++) {
        //     if(list.contains(nums[i])) // some element appears more than once
        //         return true;
        //     list.add(nums[i]);
        // }
        // return false;

        // Solution 1: Use data structure HashSet to solve -> Accepted
        // It has the highest efficiency among the three solutions.
        // The usage of HashSet is very similar to List, but it works better.
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i]))
                return true;
            else
                set.add(nums[i]);
        }
        return false;

        // Solution 2: Use data structure HashMap to solve -> Accepted
        // So we can conclude that the searching efficiency of hashmap
        // is higher than that of list
        // HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        // for(int i = 0; i < nums.length; i++) {
        //     if(count.containsKey(nums[i]))
        //         return true;
        //     count.put(nums[i], 1);
        // }
        // return false;

        // Solution 3: Use Arrays.sort() to sort the array nums -> Accepted
        // Note that this efficiency of this solution is much lower than
        // the solution 2, which utilizes the data structure hashmap
        // Arrays.sort(nums);
        // for(int i = 1; i < nums.length; i++) {
        //     if(nums[i] == nums[i -1])
        //         return true;
        // }
        // return false;
    }
}
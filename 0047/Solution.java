// Solution without pruning
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] flags = new boolean[nums.length];
        List<Integer> path = new ArrayList<>();
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        dfs(nums, flags, path, res);
        return new ArrayList<>(res);
    }

    public void dfs(int[] nums, boolean[] flags, List<Integer> path, Set<List<Integer>> res) {
        if(path.size() == flags.length) {
            res.add(List.copyOf(path));
            return;
        }

        for(int idx = 0; idx < nums.length; idx++) {
            if(!flags[idx]) {
                flags[idx] = true;
                path.add(nums[idx]);
                dfs(nums, flags, path, res);
                flags[idx] = false;
                path.remove(path.size() - 1);
            }
        }
    }
}

// Solution with pruning
// class Solution {
//     public List<List<Integer>> permuteUnique(int[] nums) {
//         boolean[] flags = new boolean[nums.length];
//         List<Integer> path = new ArrayList<>();
//         Set<List<Integer>> res = new HashSet<>();
//         Arrays.sort(nums);
//         dfs(nums, flags, path, res);
//         return new ArrayList<>(res);
//     }

//     public void dfs(int[] nums, boolean[] flags, List<Integer> path, Set<List<Integer>> res) {
//         if(path.size() == flags.length) {
//             res.add(List.copyOf(path));
//             return;
//         }

//         for(int idx = 0; idx < nums.length; idx++) {
//             // pruning
//             if(idx > 0 && nums[idx] == nums[idx - 1] && !flags[idx - 1]) {
//                 continue;
//             }

//             if(!flags[idx]) {
//                 flags[idx] = true;
//                 path.add(nums[idx]);
//                 dfs(nums, flags, path, res);
//                 flags[idx] = false;
//                 path.remove(path.size() - 1);
//             }
//         }
//     }
// }
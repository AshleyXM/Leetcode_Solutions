class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        Set<List<Integer>> res = new HashSet<>();
        List<Integer> path = new ArrayList<>();
        dfs(candidates, 0, candidates.length, target, path, res);
        return new ArrayList<>(res);
    }

    public void dfs(int[] candidates, int left, int right, int target, List<Integer> path, Set<List<Integer>> res) {
        // base case
        if(target < 0) {
            return;
        } else if(target == 0) {
            res.add(List.copyOf(path));
            return;
        }

        // recursive part: target > 0
        for(int idx = left; idx < right; idx++) {
            // candidates是升序的，因此当目前的值已经大于target就没有必要继续向后遍历了
            if(target - candidates[idx] < 0) {
                break;
            }
            // 当前一个数字和当前的数字相同时，没有必要重复之前的过程
            if(idx > left && candidates[idx] == candidates[idx - 1]) {
                continue;
            }
            path.add(candidates[idx]);
            dfs(candidates, idx + 1, right, target - candidates[idx], path, res);
            path.remove(path.size() - 1);
        }
    }
}
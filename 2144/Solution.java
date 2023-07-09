class Solution {
    public int minimumCost(int[] cost) {
        // Solution 1: Pay for two, and get one free
        // Arrays.sort(cost);
        // int total = 0;
        // for(int i = cost.length - 1; i >= 0; i -= 3) {
        //     if(i >= 1) {
        //         total += cost[i] + cost[i - 1];
        //     } else if(i == 0) {
        //         total += cost[i];
        //     }
        // }
        // return total;

        // Solution 1 plus: Optimize the solution based on solution 1
        Arrays.sort(cost);
        int total = 0;
        for(int i = cost.length - 1; i >= 0; i--) {
            if((cost.length - i) % 3 != 0) {
                total += cost[i];
            }
        }
        return total;
    }
}
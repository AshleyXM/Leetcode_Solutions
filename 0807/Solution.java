class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] rows = new int[grid.length];
        int[] cols = new int[grid.length];
        // get the maximum value in each row and each column
        // Two double nested for loops to get the result
		// for(int i = 0; i < grid.length; i++) {
        //     int max = 0;
        //     for(int j = 0; j < grid.length; j++) {
        //         if(grid[i][j] > max) max = grid[i][j];
        //     }
        //     rows[i] = max;
        // }

        // for(int i = 0; i < grid.length; i++) {
        //     int max = 0;
        //     for(int j = 0; j < grid.length; j++) {
        //         if(grid[j][i] > max) max = grid[j][i];
        //     }
        //     cols[i] = max;
		// }
		
        // Optimize over the above two double nested for loops
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid.length; j++) {
                rows[i] = Math.max(rows[i], grid[i][j]);
                cols[j] = Math.max(cols[j], grid[i][j]);
            }
        }

        int sum = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid.length; j++) {
                sum += Math.min(rows[i], cols[j]) - grid[i][j];
            }
        }
        return sum;
    }
}
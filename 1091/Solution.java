class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        // The idea of the solution is similar to Bellman-Ford algorithm
        if(grid[0][0] != 0)
            return -1;
        int grid_size = grid.length;
        for(int i = 0; i < grid_size; i++) {
            for(int j = 0; j < grid_size; j++) {
                if(grid[i][j] == 1)
                    grid[i][j] = -1;
                else
                    grid[i][j] = Integer.MAX_VALUE;
            }
        }
        grid[0][0] = 1;
        List<String> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        list.add("0,0"); // add the first element: (0, 0)
        while(list.size() != 0) {
            String coordinates = list.get(0);
            int seperator = coordinates.indexOf(",");
            int row = Integer.parseInt(coordinates.substring(0, seperator));
            int column = Integer.parseInt(coordinates.substring(seperator + 1, coordinates.length()));
            list.remove(0);
            // update the distances of all its neighbors if smaller distance is found
            // from the top left to bottom right (nine elements)
            for(int r = -1; r <= 1; r++) {
                for(int c = -1; c <= 1; c++) {
                    if(row + r >= 0 && row + r <= grid_size - 1 &&
                       column + c >= 0 && column + c <= grid_size - 1 &&
                       grid[row + r][column + c] != -1) {
                        if(grid[row][column] + 1 < grid[row + r][column + c]) {
                            grid[row + r][column + c] = grid[row][column] + 1;
                            String tmp = "" + (row + r) + "," + (column + c);
                            list.add(tmp); // add every element which has updated its distance
                        }
                    }
                }
            }
            if(grid[grid_size - 1][grid_size - 1] < min)
                min = grid[grid_size - 1][grid_size - 1];
        }
        return (min == Integer.MAX_VALUE) ? -1 : min;
    }
}
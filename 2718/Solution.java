class Solution {
    public long matrixSumQueries(int n, int[][] queries) {
        boolean[] rowVisited = new boolean[n]; // record the visiting status of a specified row
        boolean[] columnVisited = new boolean[n]; // record the visiting status of a specified column
        int rowVisitedNum = 0, columnVisitedNum = 0; // record the number of elements whose value is true in the above two arrays
        long sum = 0;
        // the most subtle part of this solution is the starting value of the loop, 
        // i.e. loop the queries reversely (cuz the latter assignment will overwrite the former assignments)
        for(int i = queries.length - 1; i >= 0; i--) {
            int type = queries[i][0], index = queries[i][1], val = queries[i][2];
            if(type == 0 && !rowVisited[index]) {
                sum += (n - columnVisitedNum) * val;
                rowVisited[index] = true;
                rowVisitedNum++;
            } else if(type ==  1 && !columnVisited[index]) { // type == 1
                sum += (n - rowVisitedNum) * val;
                columnVisited[index] = true;
                columnVisitedNum++;
            }
        }
        return sum;
    }
}
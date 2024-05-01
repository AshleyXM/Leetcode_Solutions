class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res =  new int[n][n];
        int num = 1;
        int up = 0, down = n - 1;
        int left = 0, right = n - 1;
        while(true) {
            // right
            for(int i = left; i <= right; i++) {
                res[up][i] = num++;
            }
            if(++up > down) break;
            // down
            for(int i = up; i <= down; i++) {
                res[i][right] = num++;
            }
            if(--right < left) break;
            // left
            for(int i = right; i >= left; i--) {
                res[down][i] = num++;
            }
            if(--down < up) break;
            // up
            for(int i = down; i >= up; i--) {
                res[i][left] = num++;
            }
            if(++left > right) break;
        }
        return res;
    }
}
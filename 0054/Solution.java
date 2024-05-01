class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        // 定义上下边界
        int up = 0, down = matrix.length - 1;
        // 定义左右边界
        int left = 0, right = matrix[0].length - 1;
        while(true) {
            // right
            for(int i = left; i <= right; i++) {
                res.add(matrix[up][i]);
            }
            if(++up > down) {
                break;
            }
            // down
            for(int i = up; i <= down; i++) {
                res.add(matrix[i][right]);
            }
            if(--right < left) {
                break;
            }
            // left
            for(int i = right; i >= left; i--) {
                res.add(matrix[down][i]);
            }
            if(--down < up) {
                break;
            }
            // up
            for(int i = down; i >= up; i--) {
                res.add(matrix[i][left]);
            }
            if(++left > right) {
                break;
            }
        }
        return res;
    }
}
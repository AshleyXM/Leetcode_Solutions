class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Solution 1: Double-nested binary search
        // int rhead = 0;
        // int rtail = matrix.length - 1;
        // while(rhead <= rtail) {
        //     int rmid = (rhead + rtail) / 2;
        //     if(target < matrix[rmid][0]) {
        //         rtail = rmid - 1;
        //     } else if(target > matrix[rmid][matrix[0].length - 1]) {
        //         rhead = rmid + 1;
        //     } else if(target >= matrix[rmid][0] && target <= matrix[rmid][matrix[0].length - 1]) {
        //         int chead = 0;
        //         int ctail = matrix[0].length - 1;
        //         while(chead <= ctail) {
        //             int cmid = (chead + ctail) / 2;
        //             if(target > matrix[rmid][cmid]) {
        //                 chead = cmid + 1;
        //             } else if(target < matrix[rmid][cmid]) {
        //                 ctail = cmid - 1;
        //             } else {
        //                 return true;
        //             }
        //         }
        //         return false;
        //     }
        // }
        // return false;

        // Solution 2: Compare target with the largest value of the current row
        int row = 0;
        int column = matrix[0].length - 1; // the initial value is the key point of this solution!
        while(row <= matrix.length - 1 && column >= 0) {
            if(target == matrix[row][column]) {
                return true;
            } else if(target > matrix[row][column]) {
                row++;
            } else { // target < matrix[row][column]
                column--;
            }
        }
        return false;
    }
}
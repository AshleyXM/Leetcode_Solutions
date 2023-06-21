class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Solution 1: A dumb solution by judging from three dimensions
        // int size = board.length;
        // // judge from row
        // for(int row = 0; row < size; row++) {
        //     int[] tmp = new int[10];
        //     for(int col = 0; col < size; col++) {
        //         if(board[row][col] != '.') {
        //             if(tmp[board[row][col] - '0'] == 1)
        //                 return false;
        //             tmp[board[row][col] - '0']++;
        //         }
        //     }
        // }
        // // judge from column
        // for(int col = 0; col < size; col++) {
        //     int[] tmp = new int[10];
        //     for(int row = 0; row < size; row++) {
        //         if(board[row][col] != '.') {
        //             if(tmp[board[row][col] - '0'] == 1)
        //                 return false;
        //             tmp[board[row][col] - '0']++;
        //         }
        //     }
        // }
        // // judge from sub-boxes
        // for(int row = 0; row < size; row += 3) {
        //     for(int col = 0; col < size; col += 3) {
        //         int[] tmp = new int[10];
        //         int count = 0;
        //         while(count < 9) {
        //             if(board[row + count / 3][col + count % 3] != '.') {
        //                 if(tmp[board[row + count / 3][col + count % 3] - '0'] == 1)
        //                     return false;
        //                 tmp[board[row + count / 3][col + count % 3] - '0']++;   
        //             }
        //             count++;
        //         }
        //     }
        // }
        // return true;

        // Solution 2: Utilize HashSet to solve this problem subtly
        // 0(5) --- 5 in the row 0
        // (5)0 --- 5 in the column 0
        // 0(5)0 --- 5 in the sub-box whose index of the top-left element is (0,0)
        Set hashset = new HashSet();
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] != '.') {
                    String tmp = "(" + board[i][j] + ")";
                    if(!hashset.add(i + tmp) || !hashset.add(tmp + j) || !hashset.add(i / 3 + tmp + j / 3))
                        return false;
                }
            }
        }
        return true;
    }
}
class Solution {
    public String convertToTitle(int columnNumber) {
        // Solution 1:
        // String res = "";
        // if(columnNumber == 1)
        //     return "A";
        // while(columnNumber != 0) {
        //     char tmp = 'A';
        //     tmp += (columnNumber - 1) % 26; // as A -> 1 rather than 0
        //     res = tmp + res;
        //     if(columnNumber == 26) {
        //         columnNumber = 0;
        //         break;
        //     }
        //     columnNumber = (columnNumber - (tmp - 'A' + 1)) / 26;
        // }
        // return res;

        // Solution 1 plus: optimize based on solution 1 
        String res = "";
        while(columnNumber > 26) {
            char tmp = 'A';
            tmp += (columnNumber - 1) % 26; // as A -> 1 rather than 0
            res = tmp + res;
            columnNumber = (columnNumber - (tmp - 'A' + 1)) / 26;
        }
        char tmp = 'A';
        tmp += columnNumber % 27 - 1;
        res = tmp + res;
        return res;
    }
}
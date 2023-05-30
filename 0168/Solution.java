class Solution {
    public String convertToTitle(int columnNumber) {
        String res = "";
        if(columnNumber == 1)
            return "A";
        while(columnNumber != 0) {
            char tmp = 'A';
            tmp += (columnNumber - 1) % 26; // as A -> 1 rather than 0
            res = tmp + res;
            if(columnNumber == 26) {
                columnNumber = 0;
                break;
            }
            columnNumber = (columnNumber - (tmp - 'A' + 1)) / 26;
        }
        return res;
    }
}
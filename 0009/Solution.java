class Solution {
    public boolean isPalindrome(int x) {
        // Solution 1: convert the integer into a string
        // String str = "" + x;
        // String str_rvrs = new StringBuffer(str).reverse().toString();
        // if(str.equals(str_rvrs))
        //     return true;
        // else
        //     return false;

        // Solution 2: without converting the integer into a string
        if(x < 0)
            return false;
        int tmp_x = x;
        int res = 0; // store
        while(tmp_x / 10 != 0) {
            res = res * 10 + tmp_x % 10;
            tmp_x /= 10;
        }
        res = res * 10 + tmp_x % 10;
        if(res == x)
            return true;
        else
            return false;
    }
}
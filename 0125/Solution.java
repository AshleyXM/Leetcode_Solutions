class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase(); // convert all the capital letters into small letters
        String str = "";
        for(int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if((cur >= '0' && cur <= '9') || (cur >= 'a' && cur <= 'z')) {
                str += cur;
            }
        }
        String str_rvrs = new StringBuffer(str).reverse().toString();
        if(str.equals(str_rvrs))
            return true;
        else
            return false;
    }
}
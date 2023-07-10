class Solution {
    int flag = 0; // ever deleted one character or not
    public boolean validPalindrome(String s) {
        return isPalindrome(0, s.length() - 1, s);
    }

    public boolean isPalindrome(int low, int high, String s) {
        while(low <= high) {
            if(s.charAt(low) == s.charAt(high)) {
                low++;
                high--;
            } else {
                if(flag == 0) {
                    flag = 1;
                    // remove the left character or the right character
                    return isPalindrome(low, high - 1, s) || isPalindrome(low + 1, high, s);
                } else { // more than one character needs removing
                    return false;
                }
            }
        }
        return true;
    }
}
class Solution {
    public int lengthOfLastWord(String s) {
        int flag = 0;
        int len = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) != ' ') { // not a space
                if(flag == 0) {
                    flag = 1;
                }
                len++;
            } else { // a space
                if(flag == 1)
                    return len;
            }
        }
        return len;
    }
}
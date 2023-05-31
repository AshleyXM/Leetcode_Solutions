class Solution {
    public boolean isSubsequence(String s, String t) {
        int pt = -1; // a pointer used to traverse string t
        for(int i = 0; i < s.length(); i++) {
            int flag = 0; // mark the exit point of the below while loop
            while(pt < t.length() - 1) { // as long as pt is still in string t
                flag = 0;
                pt++;
                if(s.charAt(i) == t.charAt(pt)) { // find the current character in string s
                    flag = 1;
                    break; // stop the loop and start to find the next character
                }
            }
            if(pt == t.length() - 1 && flag == 0) {
                return false;
            }
        }
        return true;
    }
}
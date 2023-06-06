class Solution {
    public void reverseString(char[] s) {
        // Solution 1: Use one pointer to traverse and switch
        char tmp;
        int p = 0;
        while(p <= s.length / 2 - 1) {
            tmp = s[p];
            s[p] = s[s.length - p - 1];
            s[s.length - p - 1] = tmp;
            p++;
        }
        
        // Solution 2: Use String structure to store the reverse string
        // String res = "";
        // for(int i = 0; i < s.length; i++) {
        //     res = s[i] + res;
        // }
        // for(int i = 0; i < res.length(); i++) {
        //     s[i] = res.charAt(i);
        // }

        // Solution 3: Use the built-in class StringBuilder to solve
        // StringBuilder sb = new StringBuilder();
        // sb.append(s);
        // sb.reverse();
        // for(int i = 0; i < sb.length(); i++) {
        //     s[i] = sb.charAt(i);
        // }
    }
}
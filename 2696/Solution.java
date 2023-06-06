class Solution {
    public int minLength(String s) {
        // Solution 1: Use the built-in function to solve the problem,
        // whose efficiency is not very high
        // while(s.indexOf("AB") != -1 || s.indexOf("CD") != -1) {
        //     s = s.replaceAll("AB", "");
        //     s = s.replaceAll("CD", "");
        // }
        // return s.length();

        // Solution 2: Use the stack structure to solve
        char[] stack = new char[s.length()];
        int top = -1; // mark the top of the stack
        for(int i = 0; i < s.length(); i++) {
            stack[++top] = s.charAt(i);
            if(top >= 1) {
                String tmp = "";
                tmp = tmp + stack[top - 1] + stack[top];
                if(tmp.equals("AB") || tmp.equals("CD")) {
                    top -= 2;
                }
            }
        }
        return top + 1; // 0-indexed
    }
}
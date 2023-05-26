class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> par = new HashMap<Character, Character>();
        par.put(')','(');
        par.put(']','[');
        par.put('}','{');
        char[] stack = new char[10000];
        int pointer = 0; // the pointer to stack
        for(int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if(tmp == '(' || tmp == '{' || tmp == '[') {
                stack[pointer++] = tmp;
            } else {
                if(pointer > 0 && par.get(tmp) == stack[pointer-1]) {
                    pointer--;
                } else {
                    return false;
                }
            }
        }
        if(pointer == 0)
            return true;
        else
            return false;
    }
}
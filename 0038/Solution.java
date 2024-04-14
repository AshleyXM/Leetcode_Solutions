class Solution {
    public String countAndSay(int n) {
        String str = "1";
        for(int i = 2; i <= n; i++) {
            String tmp = "";
            int counter = 0;
            char cur_ch = str.charAt(0);
            for(char ch: str.toCharArray()) {
                if(ch == cur_ch) {
                    counter++;
                } else {
                    tmp = tmp + counter + cur_ch;
                    cur_ch = ch;
                    counter = 1;
                }
            }
            tmp = tmp + counter + cur_ch;
            str = tmp;
        }
        return str;
    }
}
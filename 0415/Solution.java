class Solution {
    public String addStrings(String num1, String num2) {
        // Solution 1: Reverse the two original strings, and then calculate,
        // and reverse the calculated result to get the final result
        String reverse1 = new StringBuffer(num1).reverse().toString();
        String reverse2 = new StringBuffer(num2).reverse().toString();
        int len_diff = (num1.length() > num2.length()) ? (num1.length() - num2.length()) : (num2.length() - num1.length());
        // make sure that the length of reverse1 is equal to that of reverse2
        if(num1.length() > num2.length()) { // length: reverse1 > reverse2
            for(int i = 0; i < len_diff; i++) {
                reverse2 += "0";
            }
        } else { // length: reverse2 >= reverse1
            for(int i = 0; i < len_diff; i++)
                reverse1 += "0";
        }

        String res = "";
        int cb = 0; // carry bit
        for(int i = 0; i < reverse1.length(); i++) {
            int tmp = (reverse1.charAt(i) - '0') + (reverse2.charAt(i) - '0');
            res += (tmp + cb) % 10;
            cb = (tmp + cb) / 10;
        }
        if(cb != 0) {
            char tmp = '0';
            tmp += cb;
            res += tmp;
        }
        return new StringBuffer(res).reverse().toString();

        // Solution 2: Use two pointers, move from back to front
        // int p1 = num1.length() - 1;
        // int p2 = num2.length() - 1;
        // String res = "";
        // int cb = 0; // carry bit
        // while(p1 >= 0 || p2 >= 0) {
        //     int tmp1 = (p1 >= 0) ? (num1.charAt(p1) - '0') : 0;
        //     int tmp2 = (p2 >= 0) ? (num2.charAt(p2) - '0') : 0;
        //     res = (tmp1 + tmp2 + cb) % 10 + res;
        //     cb = (tmp1 + tmp2 + cb) / 10;
        //     p1--;
        //     p2--;
        // }
        // if(cb != 0)
        //     res = cb + res;
        // return res;
    }
}
class Solution {
    public String addStrings(String num1, String num2) {
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
    }
}
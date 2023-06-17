class Solution {
    public int myAtoi(String s) {
        // flag: 1 - whitespace reading mode, 2 - sign reading mode
        //       3 - digits reading mode, 4 - non-digits reading mode
        int flag = 1;
        int sign = 1; // the sign of the number
        int number = 0; // the final result
        for(int i = 0; i < s.length(); i++) {
            if(flag == 1 && s.charAt(i) == ' ') {
                continue;
            } else if(flag == 1 && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
                sign = (s.charAt(i) == '+') ? 1 : -1;
                flag = 2;
            } else if(flag < 2 && (s.charAt(i) < '0' || s.charAt(i) > '9')) { // flag == 0 || flag == 1
                return number;
            } else if(flag == 1 && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sign = 1;
                number = number * 10 + (s.charAt(i) - '0');
                flag = 2; // set flag to digit reading mode
            } else if(flag == 2 && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                if((Integer.MAX_VALUE - (s.charAt(i) - '0')) / 10 >= number) {
                    number = number * 10 + (s.charAt(i) - '0');
                } else {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            } else if(flag == 2 && (s.charAt(i) < '0' || s.charAt(i) > '9')) {
                return number * sign;
            }
        }
        return number * sign;
    }
}
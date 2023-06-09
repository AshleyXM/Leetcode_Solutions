class Solution {
    public int[] plusOne(int[] digits) {
        int[] res = new int[digits.length + 1];
        int cb = 1; // carry bit
        for(int i = digits.length - 1; i >= 0; i--) {
            int tmp = digits[i] + cb;
            digits[i] = tmp % 10;
            cb = tmp / 10;
            if(cb == 0)
                break;
        }
        // if the carry bit for the most significant digit is not zero
        if(cb != 0) {
            res[0] = cb;
            for(int i = 0; i < digits.length; i++) {
                res[i + 1] = digits[i];
            }
            return res;
        }
        return digits;
    }
}
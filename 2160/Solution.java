class Solution {
    public int minimumSum(int num) {
        int[] digits = new int[4];
        int pointer = 0;
        while(pointer < 4) {
            digits[pointer++] = num % 10;
            num /= 10;
        }
        Arrays.sort(digits);
        int new1 = digits[0] * 10 + digits[3];
        int new2 = digits[1] * 10 + digits[2];
        return new1 + new2;
    }
}
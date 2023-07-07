class Solution {
    public int splitNum(int num) {
        int[] digits = new int[10];
        int pointer = 0;
        while(num != 0) {
            digits[pointer++] = num % 10;
            num /= 10;
        }
        Arrays.sort(digits, 0, pointer); // sort all the digits in num in ascending order
        int num1 = 0, num2 = 0;
        for(int i = 0; i < pointer; i++) {
            // place as small as possible digit at higher significant position
            if(i % 2 == 0) {
                num1 = num1 * 10 + digits[i];
            } else {
                num2 = num2 * 10 + digits[i];
            }
        }
        return num1 + num2;
    }
}
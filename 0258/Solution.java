class Solution {
    public int addDigits(int num) {
        // Solution 1: use while loop to calculate the result every round
        // while(num > 9) { // more than one digit
        //     int res = 0;
        //     while(num != 0) {
        //         res += num % 10;
        //         num /= 10;
        //     } // set the initial value for res
        //     num = res;
        // }
        // return num;

        // Solution 2: solve it by using the pattern
        while(num > 9) 
            num = num % 10 + num / 10;
        return num;
    }
}
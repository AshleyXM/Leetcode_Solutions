class Solution {
    public String intToRoman(int num) {
        String result = "";
        int[] domination = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for(int i = 0; i < domination.length; i++) {
            while(num / domination[i] != 0) {
                result += symbols[i];
                num -= domination[i];
            }
        }
        return result;
    }
}
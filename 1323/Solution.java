class Solution {
    public int maximum69Number (int num) {
        // Solution 1: Find the first 6 and replace it with 9
        // String numStr = String.valueOf(num);
        // String newNumStr = "";
        // for(int i = 0; i < numStr.length(); i++) {
        //     if(numStr.charAt(i) == '6') {
        //         newNumStr += '9';
        //         newNumStr += numStr.substring(i + 1, numStr.length());
        //         break;
        //     } else {
        //         newNumStr += numStr.charAt(i);
        //     }
        // }
        // return newNumStr.equals("") ? Integer.parseInt(numStr): Integer.parseInt(newNumStr);

        // Solution 1p: Use toCharArray to optimize
        // char[] digits = String.valueOf(num).toCharArray();
        // for(int i = 0; i < digits.length; i++) {
        //     if(digits[i] == '6') {
        //         digits[i] = '9';
        //         break;
        //     }
        // }
        // return Integer.parseInt(new String(digits));

        // Solution 2: Use function replaceFirst
        return Integer.parseInt(String.valueOf(num).replaceFirst("6", "9"));
    }
}
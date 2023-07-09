class Solution {
    public String removeDigit(String number, char digit) {
        // Solution 1: Convert the string into char array and find the index that needs replacing
        // char[] characters = number.toCharArray();
        // int index = -1;
        // for(int i = 0; i < characters.length; i++) {
        //     if(characters[i] == digit) {
        //         if(i < characters.length - 1 && characters[i] < characters[i + 1]) {
        //             index = i;
        //             break;
        //         }
        //         index = i;
        //     }
        // }
        // String res = "";
        // for(int i = 0; i < characters.length; i++)
        //    if(i != index) res += characters[i];
        // return res;

        // Solution 1 plus: Concatenate two substrings
        int index = -1;
        for(int i = 0; i < number.length(); i++) {
            if(number.charAt(i) == digit) {
                if(i < number.length() - 1 && number.charAt(i) < number.charAt(i + 1)) {
                    index = i;
                    break;
                }
                index = i;
            }
        }
        return number.substring(0, index) + number.substring(index + 1, number.length());
    }
}
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int pointer = 0;
        String res = "";
        while(pointer < word1.length() && pointer < word2.length()) {
            res = res + word1.charAt(pointer) + word2.charAt(pointer);
            pointer++;
        }
        if(pointer == word1.length()) { // reach the end of word1
            res += word2.substring(pointer, word2.length()); // concatenate the rest of word2
        } else { // reach the end of word2
            res += word1.substring(pointer, word1.length()); // concatenate the rest of word1
        }
        return res;
    }
}
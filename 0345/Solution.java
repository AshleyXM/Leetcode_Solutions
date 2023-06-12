class Solution {
    public String reverseVowels(String s) {
        // DO NOT neglect the uppercase situation!
        List<Integer> vowels = new ArrayList<>(); // store the indices of all the vowels
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(isVowel(current))
                vowels.add(i);
        }
        String res = "";
        int pointer = vowels.size() - 1; // the initial position of pointer should be the last element of vowels
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(isVowel(current)) {
                res += s.charAt(vowels.get(pointer));
                pointer--;
            } else {
                res += current; 
            }
        }
        return res;
    }

    // return whether the input character is a vowel (uppercase or lowercase) or not
    public boolean isVowel(char chrt) {
        if(chrt >= 'A' && chrt <= 'Z') // uppercase letter
            chrt = (char)(chrt + 32);
        if(chrt == 'a' || chrt == 'e' || chrt == 'i' || chrt == 'o' || chrt == 'u')
            return true;
        return false;
    }
}
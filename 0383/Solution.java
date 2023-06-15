class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] mgzletters = new int[26];
        for(int i = 0; i < magazine.length(); i++) {
            mgzletters[magazine.charAt(i) - 'a']++;
        }
        for(int i = 0; i < ransomNote.length(); i++) {
            if(mgzletters[ransomNote.charAt(i) - 'a'] > 0) {
                mgzletters[ransomNote.charAt(i) - 'a']--;
            } else {
                return false;
            }
        }
        return true;
    }
}
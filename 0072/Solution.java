class Solution {
    public int minDistance(String word1, String word2) {
        int[][] res = new int[word1.length() + 1][word2.length() + 1];
        for(int i = 0; i <= word2.length(); i++) {
            res[0][i] = i;
        }
        for(int j = 0; j <= word1.length(); j++) {
            res[j][0] = j;
        }
        for(int i = 1; i <= word1.length(); i++) {
            for(int j = 1; j <= word2.length(); j++) {
                int tmp1 = res[i - 1][j] + 1;
                int tmp2 = res[i][j - 1] + 1;
                int tmp3 = res[i - 1][j - 1] + ((word1.charAt(i - 1) == word2.charAt(j - 1)) ? 0 : 1);
                int min = Math.min(tmp1, tmp2);
                min = Math.min(min, tmp3);
                res[i][j] = min;
            }
        }
        return res[word1.length()][word2.length()];
    }
}
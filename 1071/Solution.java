class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // make str1 store the longer string between str1 and str2
        if(str1.length() < str2.length()) {
            String tmp = str1;
            str1 = str2;
            str2 = tmp;
        } 
        int len1 = str1.length();
        int len2 = str2.length();
        for(int i = len2 - 1; i >= 0; i--) {
            String tmp = str2.substring(0, i + 1);
            if(len1 % (i + 1) == 0 && len2 % (i + 1) == 0) {
                if(str1.equals(concatenate(tmp, len1 / (i + 1))) 
                    && str2.equals(concatenate(tmp, len2 / (i + 1))))
                    return tmp;
            }
        }
        return "";
    }

    // return basestr * times
    public String concatenate(String basestr, int times) {
        String res = "";
        for(int i = 0; i < times; i++)
            res += basestr;
        return res;
    }
}
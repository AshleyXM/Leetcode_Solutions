class Solution {
    public int strStr(String haystack, String needle) {
        int hlen = haystack.length();
        int nlen = needle.length();
        if(hlen < nlen)
            return -1;
        else {
            for(int i = 0; i < hlen - nlen + 1; i++) {
                int flag = 0;
                for(int j = 0; j < nlen; j++) {
                    if(haystack.charAt(i+j) == needle.charAt(j)) {
                        flag++;
                    } else {
                        break;
                    }
                }
                if(flag == nlen) {
                    return i;
                }
            }
            return -1;
        }
    }
}
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int pg = 0, ps = 0;
        int num = 0;
        while(pg < g.length && ps < s.length) {
            if(s[ps] >= g[pg]) {
                num++;
                pg++;
            }
            ps++;
        }
        return num;
    }
}
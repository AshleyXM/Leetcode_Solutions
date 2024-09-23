class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int pa = 0, pb = 0;
        int alen = firstList.length, blen = secondList.length;
        List<int[]> res = new ArrayList<>();
        while(pa < alen && pb < blen) {
            int[] cura = firstList[pa];
            int[] curb = secondList[pb];
            int maxLeft = Math.max(cura[0], curb[0]);
            int minRight = Math.min(cura[1], curb[1]);
            if(maxLeft <= minRight) {
                res.add(new int[]{maxLeft, minRight});
            }
            if(cura[1] < curb[1]) {
                pa++;
            } else {
                pb++;
            }
        }
        return res.toArray(new int[0][]);
    }
}
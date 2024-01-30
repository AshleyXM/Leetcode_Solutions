class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        // 1. Set up an flag array to record
        // int[] res = new int[k];
        // int pos = 0;
        // int[] flag = new int[mat.length];
        // for(int col = 0; col < mat[0].length; col++) {
        //     for(int row = 0; row < mat.length; row++) {
        //         if(flag[row] == 0 && mat[row][col] == 0) {
        //             res[pos++] = row;
        //             flag[row] = 1;
        //         }
        //         if(pos == k) {
        //             return res;
        //         }
        //     }
        // }
        // if(pos != k) {
        //   for(int i = 0; i < mat.length; i++) { // traverse array flag
        //       if(flag[i] == 0) {
        //           res[pos++] = i;
        //       }
        //       if(pos == k) {
        //           break;
        //       }
        //   }
        // }
        // return res;

        // 2. Use sort method
        int[] res = new int[k];
        int pos = 0;
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < mat.length; i++) {
            int sum = 0;
            for(int j = 0; j < mat[0].length; j++) {
                sum += mat[i][j];
            }
            map.put(i, sum);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                // sort by value(asc), when the values are equal, sort by key(asc)
                if(o1.getValue() == o2.getValue()) {
                    return o1.getKey() - o2.getKey();
                }
                return o1.getValue() - o2.getValue();
            }
        });

        for(Map.Entry<Integer, Integer> mapping: list){
            res[pos++] = mapping.getKey();
            if(pos == k) {
                break;
            }
        }
        return res;
    }
}
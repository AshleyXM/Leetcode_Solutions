class Solution {
    public String restoreString(String s, int[] indices) {
        // Solution 1: Create a 2d array to store the corresponding relationship
        // char[] characters = s.toCharArray();
        // int[][] comparatorArray = new int[indices.length][2];
        // for(int i = 0; i < indices.length; i++) { // store a letter and its corresponding index into a 2d array
        //     comparatorArray[i][0] = (int)s.charAt(i);
        //     comparatorArray[i][1] = indices[i];
        // }
        // // sort the 2d array by the second dimension which stores the index info in ascending order
        // Arrays.sort(comparatorArray, (o1, o2) -> o1[1] - o2[1]);
        // String res = "";
        // for(int i = 0; i < indices.length; i++) {
        //     res += (char)(comparatorArray[i][0]);
        // }
        // return res;

        // Solution 2: Create an array to store the corresponding relationship in ascending order
        char[] characters = new char[indices.length];
        for(int i = 0; i < indices.length; i++) {
            characters[indices[i]] = s.charAt(i);
        }
        return String.valueOf(characters);
    }
}
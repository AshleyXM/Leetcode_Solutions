class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        // sort boxTypes by the second dimension in descending order
        Arrays.sort(boxTypes, (o1, o2) -> o2[1] - o1[1]);
        int sum = 0;
        int pointer = 0;
        while(truckSize > 0 && pointer < boxTypes.length) {
            if(boxTypes[pointer][0] <= truckSize) {
                sum += boxTypes[pointer][0] * boxTypes[pointer][1];
                truckSize -= boxTypes[pointer][0];
                pointer++;
            } else {
                sum += truckSize * boxTypes[pointer][1];
                truckSize = 0;
            }
        }
        return sum;
    }
}
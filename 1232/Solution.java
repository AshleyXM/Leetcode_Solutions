class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length == 2)
            return true;
        if(coordinates[1][0] - coordinates[0][0] != 0) {
            // Line: y = k * (x - coordinates[0][0]) + coordinates[0][1]
            double slope = (double)(coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0]);
            for(int i = 2; i < coordinates.length; i++) {
                if((double)coordinates[i][1] != slope * (coordinates[i][0] - coordinates[0][0]) + coordinates[0][1])
                    return false;
            }
        } else { // a vertical line
            for(int i = 2; i < coordinates.length; i++) {
                if(coordinates[i][0] != coordinates[0][0]) // the value on x axis is different
                    return false;
            }
        }
        return true;
    }
}
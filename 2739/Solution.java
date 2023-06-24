class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        // Solution 1: A dumb solution with just while loop
        // int mileage = 0;
        // while(mainTank >= 5) {
        //     mileage += 50;
        //     mainTank -= 5;
        //     if(additionalTank > 0) {
        //         mainTank += 1;
        //         additionalTank -= 1;
        //     }
        // }
        // mileage += mainTank * 10;
        // return mileage;

        // Solution 2:
        // Let x be the number of liters borrowed from the additional tank
        // 1. x <= additionalTank
        // 2. mainTank + x > 5x => x <= (mainTank - 1) / 4
        return (mainTank + Math.min(additionalTank, (mainTank - 1) / 4)) * 10;
    }
}
class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int sum = 0;
        for(int i = 0; i < energy.length; i++) {
            if(initialEnergy > energy[i]) { // strictly greater energy than the opponent
                initialEnergy -= energy[i];
            } else {
                sum += (energy[i] - initialEnergy + 1);
                initialEnergy = 1;
            }
            if(initialExperience <= experience[i]) { // strictly greater experience than the opponent
                int diff = experience[i] - initialExperience + 1;
                sum += diff;
                initialExperience += diff;
            }
            initialExperience += experience[i];
        }
        return sum;
    }
}
class Solution {
    public int countOdds(int low, int high) {
        if(low % 2 == 1 && high % 2 == 1) // two odds
            return (high - low) / 2 + 1;
        else if(low % 2 == 0 && high % 2 == 0) // two evens
            return (high - low) / 2;
        else // one odd, one even
            return (high - low + 1) / 2;
    }
}
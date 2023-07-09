class Solution {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        int diff = amount[0] + amount[1] - amount[2];
        if(diff > 0)
            return amount[2] + (diff + 1) / 2; // diff / 2 + diff % 2 = (diff + 1) / 2
        else
            return amount[2];
    }
}
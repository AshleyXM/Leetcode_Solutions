class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        for(int i = 0; i < position.length; i++)
            if(position[i] % 2 == 0) even++;
        return (even > position.length - even) ? position.length - even : even;
    }
}
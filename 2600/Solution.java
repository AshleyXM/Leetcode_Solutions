class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = 0;
        sum += Math.min(numOnes, k);
        k -= Math.min(numOnes, k);
        k -= Math.min(numZeros, k);
        sum -= Math.min(numNegOnes, k);
        k -= Math.min(numNegOnes, k);
        return sum;
    }
}
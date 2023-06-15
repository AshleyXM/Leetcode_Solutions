class Solution {
    public int fib(int n) {
        // Solution 1: Recursive method
        // if(n == 0 || n == 1)
        //     return n;
        // else
        //     return fib(n - 1) + fib(n - 2);

        // Solution 2: Iterative method
        int[] numbers = new int[31];
        numbers[0] = 0;
        numbers[1] = 1;
        for(int i = 2; i <= n; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        return numbers[n]; 
    }
}
class Solution {
    public double myPow(double x, int n) {
        return (n > 0) ? myMultiply(x, n) : 1 /  myMultiply(x, -n);
    }

    public double myMultiply(double x, int n) {
        // base case
        if(n == 0) {
            return 1.0;
        }
        // recursive part
        double res = myMultiply(x, n / 2); // get the result of half power
        return (n % 2 == 0) ? res * res : res * res * x;
    }
}
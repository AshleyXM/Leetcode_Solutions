class Solution {
    public double average(int[] salary) {
        // Solution 1: Use Arrays.sort() to preprocess
        // Arrays.sort(salary); // from small to large
        // double sum = 0;
        // for(int i = 1; i < salary.length - 1; i++) {
        //     sum += salary[i];
        // }
        // sum /= salary.length - 2;
        // return sum;

        // Solution 2: Traverse the array salary, and mark the minimum number
        // and the maximum number (it has higher efficiency than the first solution)
        int min = salary[0];
        int max = salary[0];
        double sum = 0;
        for(int i = 0; i < salary.length; i++) {
            sum += salary[i];
            if(salary[i] > max)
                max = salary[i];
            if(salary[i] < min)
                min = salary[i];
        }
        sum = sum - min - max;
        sum /= salary.length - 2;
        return sum;
    }
}
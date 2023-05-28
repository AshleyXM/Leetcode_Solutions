class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> total = new ArrayList<>();
        for(int i = 1; i <= numRows; i++) {
            List<Integer> current = new ArrayList<>();
            if(i >= 3) {
                List<Integer> previous = new ArrayList<>();
                previous = total.get(total.size()-1); // get the last element in List total
                current.add(1); // add a one at the beginning
                for(int j = 0; j < previous.size()-1; j++) {
                    current.add(previous.get(j) + previous.get(j + 1));
                }
                current.add(1); // add a one in the end
            } else if(i == 1) {
                current.add(1);
            } else if(i == 2) {
                current.add(1);
                current.add(1);
            }
            total.add(current);
        }
        return total;
    }
}
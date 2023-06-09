class MyHashSet {
    private static final int base = 1000001; // the maximum value for key is 10^6
    private List<Integer> hashset;

    public MyHashSet() {
        hashset = new ArrayList<Integer>();
    }
    
    public void add(int key) {
        if(!contains(key)) {
            hashset.add(key % base);
        }
    }
    
    public void remove(int key) {
        if(hashset.contains(key % base)) {
            hashset.remove(new Integer(key % base));
        }
    }
    
    public boolean contains(int key) {
        return hashset.contains(key % base);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
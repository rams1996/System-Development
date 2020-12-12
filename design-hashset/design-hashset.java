class MyHashSet {
    int[] reflect = new int[1000001];
    
    /** Initialize your data structure here. */
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        if(reflect[key] == 0){
            reflect[key] = 1;
        }
    }
    
    public void remove(int key) {
        reflect[key] = 0;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if(reflect[key] != 0){
            return true;
        }else{
            return false;
        }
    }
}
​
​
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */

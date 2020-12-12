class LRUCache {
    
    // store key value to be able to get the value by key with constatn time 
    private Map<Integer, Integer> map = new HashMap();
    // queue of last used. From [long back] to [recently]
    private Queue<Integer> queue = new LinkedList();
        
    private int capacity;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;    
    }
    
    public int get(int key) {
        if(map.containsKey(key)) {
            // remove key from the queue
            removeKeyFromTheQueue(key);
            // move the new key to the end (head)
            queue.add(key);
            // get value from map
            return map.get(key);
        } else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)) {
            // remove this key from the queue as far as we now use it
            removeKeyFromTheQueue(key);
        }
        // add it to the head of the queue
        queue.add(key);
        // trim queue according to the capacity
        trimQueue(); 
        // add to the map
        map.put(key, value); 
    }
​

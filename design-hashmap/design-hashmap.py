class MyHashMap:
​
    def __init__(self):
        self.arr=[None]*1000
        """
        Initialize your data structure here.
        """
    def hashFunction1(self,key):
        return key//1000
    def hashFunction2(self,key):
        return key%1000
​
    def put(self, key: int, value: int) -> None:
        key1=self.hashFunction1(key)
        if not self.arr[key1]:
            self.arr[key1]=[None]*1000
        key2=self.hashFunction2(key)
        self.arr[key1][key2]=value
        # print(self.arr)
            
        
        """
        value will always be non-negative.
        """
        
​
    def get(self, key: int) -> int:
        key1=self.hashFunction1(key)
        
        if not self.arr[key1]:
            return -1
        key2=self.hashFunction2(key)
        if self.arr[key1][key2]!=None:
            return self.arr[key1][key2]
        else:
            return -1
        
        
        """
        Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
        """
        
​
    def remove(self, key: int) -> None:
        key1=self.hashFunction1(key)

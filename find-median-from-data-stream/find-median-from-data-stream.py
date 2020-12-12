from heapq import heappush,heappop
class MedianFinder:
​
    def __init__(self):
        """
        initialize your data structure here.
        """
        self.max=[]
        self.min=[]
        
​
    def addNum(self, num: int) -> None:
        if not self.min and not self.max:
            heappush(self.min,num)
        else:
            if num>self.min[0]:
                heappush(self.min,num)
            else:
                heappush(self.max,-num)
        if len(self.max)-len(self.min)>1:
            maxVal=-heappop(self.max)
            heappush(self.min,maxVal)
        elif len(self.min)-len(self.max)>1:
            minVal=heappop(self.min)
            heappush(self.max,-minVal)
        
​
    def findMedian(self) -> float:
        if len(self.max)>len(self.min):
            return -self.max[0]
        elif len(self.min)>len(self.max):
            return self.min[0]
        else:
            return (-self.max[0]+self.min[0])/2
        
​
​
# Your MedianFinder object will be instantiated and called as such:
# obj = MedianFinder()
# obj.addNum(num)
# param_2 = obj.findMedian()

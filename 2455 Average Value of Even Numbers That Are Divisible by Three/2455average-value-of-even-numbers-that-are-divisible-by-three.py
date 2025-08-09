class Solution(object):
    def averageValue(self, nums):
        return sum(x for x in nums if x%6==0)/len([x for x in nums if x%6==0]) if any(x % 6==0 for x in nums)else 0
        
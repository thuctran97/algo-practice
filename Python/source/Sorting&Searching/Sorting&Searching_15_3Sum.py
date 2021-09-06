# https://leetcode.com/problems/3sum/
# 1. Create dict
# 2. Iterate left, right to middle, with each left right check in dict
class Solution:
    def threeSum(self, nums):
        nums.sort()
        data = {}
        for i in range(len(nums)):
            data[nums[i]] = i
            print (i)
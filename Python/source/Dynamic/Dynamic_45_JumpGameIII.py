import sys
# https://leetcode.com/problems/jump-game-ii/
class Solution:
    def jump(self, nums):
        dp = [sys.maxsize] * len(nums)
        dp[0] = 0
        for i in range(len(dp)):
            for j in range(i):
                if dp[j] < sys.maxsize and nums[j] + j >= i:
                    dp[i] = min(dp[i], dp[j] + 1)
        print (dp)
        return dp[-1]
ans = Solution()
print (ans.jump([3,5,2,1,2,1]))
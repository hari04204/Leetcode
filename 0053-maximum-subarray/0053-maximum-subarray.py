class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        curr=nums[0]
        m=nums[0]
        for i in range(1,len(nums)):
            curr=max(nums[i],curr+nums[i])
            m=max(m,curr)
        return m
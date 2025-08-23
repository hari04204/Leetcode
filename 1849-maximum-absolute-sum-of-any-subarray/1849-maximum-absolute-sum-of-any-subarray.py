class Solution:
    def maxAbsoluteSum(self, nums: List[int]) -> int:
        max_sum = nums[0]
        min_sum = nums[0]
        curr_max = nums[0]
        curr_min = nums[0]
        for i in range(1,len(nums)):
            curr_max = max(nums[i],nums[i]+curr_max)
            max_sum = max(curr_max, max_sum)

            curr_min = min(nums[i],nums[i]+curr_min)
            min_sum = min(curr_min, min_sum)
        return max(abs(min_sum),abs(max_sum))
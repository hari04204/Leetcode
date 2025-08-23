class Solution:
    def smallestDivisor(self, nums: List[int], threshold: int) -> int:
        mx = max(nums)
        def div(nums,div):
            ans=0
            for i in range(len(nums)):
                ans+= ceil(nums[i]/div)
            return ans
        low=1
        high = mx
        mid=0
        while low<=high:
            mid = (low+high)//2
            if div(nums,mid) <= threshold:
                high=mid-1
            else:
                low = mid+1
        return low
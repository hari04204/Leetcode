class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans, 0, new ArrayList<>(), nums);
        return ans;
    }
    public void helper(List<List<Integer>> ans, int i, List<Integer> curr,int[] nums){
        if(i==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        helper(ans,i+1,curr,nums);
        curr.remove(curr.size()-1);
        helper(ans,i+1,curr,nums);
    }
}
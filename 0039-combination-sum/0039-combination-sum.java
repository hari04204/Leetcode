class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(candidates, new ArrayList<>(), target,ans,0, 0);
        return ans;
    }
    public void backtrack(int[] candidates, List<Integer> curr, int t, List<List<Integer>> ans, int sum, int i){
        if(sum==t){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(sum>t || i>=candidates.length) return;
        curr.add(candidates[i]);
        backtrack(candidates, curr, t, ans, sum+candidates[i], i);
        curr.remove(curr.size()-1);
        backtrack(candidates, curr, t, ans, sum, i+1);
    }
}
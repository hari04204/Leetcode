class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums,new boolean[nums.length],new ArrayList<>(),ans);
        return ans;
    }
    public void backtrack(int[] nums, boolean[] visited, List<Integer> res, List<List<Integer>> ans){
        if(res.size()==nums.length){
            ans.add(new ArrayList(res));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(!visited[i]){
                visited[i]=true;
                res.add(nums[i]);
                backtrack(nums, visited, res, ans);
                visited[i] = false;
                res.remove(res.size()-1);
            }
        }
    }
}
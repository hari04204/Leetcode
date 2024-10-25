class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        perm(nums,ds,res,freq);
        return res;
    }
    public void perm(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0; i<freq.length; i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(nums[i]);
                perm(nums,ds,ans,freq);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }
    }
}
class Solution {
    public List<List<Integer>> generate(int n) {
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i = 0; i < n; i++){
            ans.add(new ArrayList<Integer>());
            for(int j = 0;j<=i; j++){
                if(j == 0){
                    ans.get(i).add(1);
                }
                else if(j == i){
                    ans.get(i).add(1);
                }
                else{
                    ans.get(i).add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
                }
            }
        }
        
        return ans;
    }
}
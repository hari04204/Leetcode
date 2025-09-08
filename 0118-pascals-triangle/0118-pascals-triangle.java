class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        ans.add(temp);
        if(n==1) return ans;
        temp = new ArrayList<>();
        temp.add(1);
        temp.add(1);
        ans.add(temp);
        if(n==2)return ans;
        int x = 3;
        while(x<=n){
            temp = new ArrayList<>();
            for(int i=0; i<x; i++){
                if(i==0){
                    temp.add(1);
                }
                else if(i==x-1){
                    temp.add(1);
                }
                else{
                    temp.add(ans.get(ans.size()-1).get(i-1)+ans.get(ans.size()-1).get(i));
                }
            }
            ans.add(temp);
            x++;
        }
        return ans;
    }
}
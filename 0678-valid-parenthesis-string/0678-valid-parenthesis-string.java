class Solution {
    public boolean checkValidString(String s) {
        HashMap<String, Boolean> memo = new HashMap<>();
        return dfs(s,0,0,memo);
    }
    public boolean dfs(String s, int i,int count,HashMap<String, Boolean> memo){
        if(i==s.length()){
            return count==0;
        }
        if(count<0) return false;
        String key = count+":"+i;
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        boolean ans = false;
        if(s.charAt(i)=='('){
            ans = dfs(s,i+1,count+1,memo);
        }
        if(s.charAt(i)==')'){
            ans = dfs(s,i+1,count-1,memo);
        }
        if(s.charAt(i)=='*'){
            ans = dfs(s,i+1,count+1,memo) || dfs(s,i+1,count-1,memo) || dfs(s,i+1,count,memo);
        }
        memo.put(key,ans);
        return ans;
    }
}
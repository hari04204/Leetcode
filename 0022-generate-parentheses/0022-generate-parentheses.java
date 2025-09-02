class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        f(res,"",0,0,n);
        return res;
    }
    public void f(List<String> res,String curr, int open, int close,int max){
        if(curr.length()==max*2) res.add(curr);
        if(open<max) f(res,curr+"(",open+1, close, max);
        if(close<open) f(res,curr+")",open, close+1, max);
    }
}
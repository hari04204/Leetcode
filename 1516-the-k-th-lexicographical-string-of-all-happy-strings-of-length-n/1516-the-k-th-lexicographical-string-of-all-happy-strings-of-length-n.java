class Solution {
    public String getHappyString(int n, int k) {
        char[] chars = new char[]{'a','b','c'};
        List<String> list = new ArrayList<>();
        helper(new StringBuilder(),n,list,chars);
        return (k>list.size())?"" : list.get(k-1);
    }
    public void helper(StringBuilder pre, int n, List<String> list, char[] chars){
        if(pre.length()==n){
            list.add(pre.toString());
            return;
        }
        for(char c : chars){
            if(pre.length()==0 || pre.charAt(pre.length()-1)!=c){
                pre.append(c);
                helper(pre,n,list,chars);
                pre.deleteCharAt(pre.length()-1);
            }
        }
    }
}
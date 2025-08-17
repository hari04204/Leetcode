class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder("");
        StringBuilder curr = new StringBuilder("");
        for(char c: s.toCharArray()){
            if(c==' '){
                res.append(curr);
                res.append(' ');
                curr = new StringBuilder("");
            }else curr.insert(0,c);
        }
        res.append(curr);
        return res.toString();
    }
}
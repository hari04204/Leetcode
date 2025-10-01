class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.equals("")) return new ArrayList<>();
        int n = digits.length();
        List<String> ans = new ArrayList<>();
        HashMap<Character, String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        helper(0,map,ans,n,"",digits);
        return ans;
    }
    public void helper(int i, HashMap<Character, String> map, List<String> ans, int n, String s,String digits){
        if(i==n){
            ans.add(s);
            return;
        }
        for(char c: map.get(digits.charAt(i)).toCharArray()){
            helper(i+1,map,ans,n,s+c,digits);
        }
    }
}
class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()<1) return new ArrayList<String>();
        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        ArrayList<String> res = new ArrayList<>();
        res = helper("",digits,map);
        return res;
    }
    public ArrayList<String> helper(String p, String up,HashMap<Character, String> map){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        String s = map.get(up.charAt(0));
        for(char c: s.toCharArray()){
            list.addAll(helper(p+c,up.substring(1),map));
        }
        return list;
    }
    
}
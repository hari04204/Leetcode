class Solution {
    public boolean checkRecord(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put( s.charAt(i), map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        if(map.containsKey('A')){
            if(map.get('A') < 2 && consecutive3DaysLate(s)){
                return true;
            }
        }
        else if(consecutive3DaysLate(s)){
            return true;
        }   
        return false;
    }
    public boolean consecutive3DaysLate(String s){
        for(int i = 0; i<s.length()-2; i++){
            if(s.charAt(i)=='L' && s.charAt(i+1)=='L' && s.charAt(i+2)=='L') return false;
        }
        return true;
    }
}
class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        res.add(words[0]);
        words[0] = hash(words[0]);
        for(int i=1; i<words.length; i++){
            String curr = hash(words[i]);
            if(!curr.equals(words[i-1])){
                res.add(words[i]);
            }
            words[i] = curr;
        }
        return res;
    }
    public String hash(String s){
        int[] freq = new int[26];
        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }
        String res = new String();
        for(int i: freq){
            res = res+i+"#";
        }
        return res;
    }
}
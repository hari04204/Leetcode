class Solution {
    public int numTilePossibilities(String tiles) {
        int[] freq = new int[26];
        for(char c: tiles.toCharArray()){
            freq[c-'A']++;
        }
        Set<String> set = new HashSet<>();
        int count = 0;
        helper("",freq,set,tiles.length());
        return set.size();
    }
    public void helper(String pre, int[]freq, Set<String> set,int n){
        if(pre.length()==n) return;
        for(int i = 0; i<26; i++){
            if(freq[i]>0){
                pre += (char) (i+'A');
                freq[i]--;
                if(!set.contains(pre)) set.add(pre);
                helper(pre,freq,set,n);
                freq[i]++;
                pre = pre.substring(0,pre.length()-1);
            }
        }
    }
}
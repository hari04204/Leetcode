class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, int[]> map = new HashMap<>();
        for(int[] row: matches){
            int[] winner = map.getOrDefault(row[0],new int[]{0,0});
            winner[0]+=1; 
            map.put(row[0],winner);
            int[] loser = map.getOrDefault(row[1],new int[]{0,0});
            loser[1]+=1;
            map.put(row[1],loser);
        }
        List<Integer> nil = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        for(Map.Entry<Integer,int[]> e: map.entrySet()){
            if(e.getValue()[1]==0) nil.add(e.getKey());
            if(e.getValue()[1]==1) one.add(e.getKey());
        }
        Collections.sort(nil);
        Collections.sort(one);
        ans.add(nil);
        ans.add(one);
        return ans;
    }
}
class Solution {
    public String frequencySort(String s) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> b.i - a.i);
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> e: map.entrySet()){
            pq.add(new Pair(e.getKey(),e.getValue()));
        }
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            for(int i = 0; i<p.i; i++){
                sb.append(p.c);
            }
        }
        return sb.toString();
    }
}
class Pair{
    char c;
    int i;
    public Pair(char c, int i){
        this.c = c;
        this.i = i;
    }
}
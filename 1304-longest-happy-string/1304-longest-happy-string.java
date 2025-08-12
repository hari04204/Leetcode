class Solution {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1,p2) -> p2.x-p1.x);
        if(a>0)pq.add(new Pair(a,'a'));
        if(b>0)pq.add(new Pair(b,'b'));
        if(c>0)pq.add(new Pair(c,'c'));
        int runlen = 0;
        char lastchar=' ';
        StringBuilder sb = new StringBuilder("");
        while(!pq.isEmpty()){
            Pair p1 = pq.poll();
            if(p1.c == lastchar && runlen==2){
                if(pq.isEmpty()) break;
                Pair p2 =pq.poll();
                sb.append(p2.c);
                lastchar=p2.c;
                runlen=1;
                if(p2.x-1>0)pq.add(new Pair(p2.x-1,p2.c));
                pq.add(p1);
            }
            else {
                sb.append(p1.c);
                if(lastchar==p1.c){
                    runlen++;
                }
                else {
                    runlen=1;
                    lastchar=p1.c;
                }
                if(p1.x-1>0) pq.add(new Pair(p1.x-1, p1.c));
            }
        }
        return sb.toString();
    }
    public class Pair{
        int x;
        char c;
        public Pair(int x, char c){
            this.x = x;
            this.c = c;
        }
    }
}
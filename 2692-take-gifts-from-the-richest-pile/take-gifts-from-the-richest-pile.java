class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        long ans = 0;
        for(int i: gifts){
            pq.add(i);
            ans+=i;
        }
        for(int i = 0; i<k; i++){
            int num = pq.poll();
            int x = (int) Math.sqrt(num);
            ans = ans-num+x;
            pq.add(x);
        }
        return ans;
    }
}
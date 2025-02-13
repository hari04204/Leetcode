class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        int minOps = 0;
        for(int num: nums) pq.add((long)num);
        while(pq.size()>1){
            long a = pq.poll();
            if(a>=k) return minOps;
            long b = pq.poll();
            pq.add((Math.min(a,b)*2)+Math.max(a,b));
            minOps++;
        }
        return minOps;
    }
}
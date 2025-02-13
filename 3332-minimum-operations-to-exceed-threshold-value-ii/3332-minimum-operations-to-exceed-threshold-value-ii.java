class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int minOps = 0;
        for(int num: nums) if(num<k)pq.add(num);
        while(!pq.isEmpty()){
            int a = pq.poll();
            minOps++;
            if(pq.isEmpty()) break;
            int b = pq.poll();
            long x = 2l*a+b;
            if(x<k) pq.add((int) x);
        }
        return minOps;
    }
}
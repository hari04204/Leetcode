class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums){
            pq.offer(i);
        }
        long ans = 0;
        while(k>0){
            int num = pq.poll();
            ans+=num;
            pq.offer((int)Math.ceil(num/3.0));
            k--;
        }
        return ans;
    }
}
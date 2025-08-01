class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[0]-b[0]);
        for(int i: nums1){
            pq.offer(new int[]{i+nums2[0],0});
        }

        while(k>0 && !pq.isEmpty()){
            int[] pair = pq.poll();
            int sum = pair[0];
            int pos = pair[1];

            List<Integer> currpair = new ArrayList<>();
            currpair.add(sum-nums2[pos]);
            currpair.add(nums2[pos]);
            ans.add(currpair);

            if(pos+1<nums2.length){
                pq.offer(new int[]{sum-nums2[pos]+nums2[pos+1], pos+1});
            }
            k--;
        }
        return ans;
    }
}
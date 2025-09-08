class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        if(k==nums.length)return nums;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            if(a[0]==b[0]) return a[1]-b[1];
            return b[0]-a[0];
        });
        for(int i=0; i<nums.length; i++){
            pq.add(new int[]{nums[i],i});
        }
        List<int[]> res = new ArrayList<>();
        for(int i = 0; i<k; i++){
            res.add(pq.poll());
        }
        Collections.sort(res, (a,b)-> a[1]-b[1]);
        int[] ans = new int[res.size()];
        while(k>0){
            ans[k-1]=res.get(k-1)[0];
            k--;
        }
        return ans;
    }
}
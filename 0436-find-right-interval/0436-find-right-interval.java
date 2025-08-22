class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] start = new int[n];
        for(int i = 0; i<n; i++){
            start[i] = intervals[i][0];
            map.put(intervals[i][0],i);
        }
        Arrays.sort(start);
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            int e = intervals[i][1];

            int si = 0;
            int ei = n-1;
            int idx = -1;
            while(si<=ei){
                int mid = si + (ei-si)/2;
                if(start[mid]>=e){
                    idx = mid;
                    ei=mid-1;
                }
                else si = mid+1;
            }
            res[i] = idx == -1 ? -1 : map.get(start[idx]);
        }
        return res;
    }
}
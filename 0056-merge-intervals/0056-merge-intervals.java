class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a,b)->{
            if(a[0]==b[0]) return a[1]-b[1];
            return a[0]-b[0];
        });
        int curStart = intervals[0][0];
        int curEnd = intervals[0][1];
        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0]>curEnd){
                ans.add(new int[]{curStart, curEnd});
                curStart = intervals[i][0];
                curEnd = intervals[i][1];
            }
            else {
                curEnd = Math.max(curEnd, intervals[i][1]);
            }
        }
        ans.add(new int[]{curStart, curEnd});
        int[][] res = new int[ans.size()][2];
        for(int i = 0; i<ans.size(); i++){
            res[i][0] = ans.get(i)[0];
            res[i][1] = ans.get(i)[1];
        }
        return res;
    }
}
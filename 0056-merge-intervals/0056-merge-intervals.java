class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> {
            if(a[0]==b[0]) return a[1]-b[1];
            else return a[0]-b[0];
        });
        
        List<int[]> lst = new ArrayList<>();
        int[] curr = intervals[0];
        
        for(int i = 1; i<intervals.length; i++){
            if(curr[1]>=intervals[i][0]){
                curr[1] = Math.max(curr[1],intervals[i][1]);
            }
            else{
                lst.add(curr);
                curr = intervals[i];
            }
        }
        lst.add(curr);
        return lst.toArray(new int[lst.size()][2]);
    }
}
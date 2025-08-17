class Solution {
    public int[][] merge(int[][] intervals) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            if(a[0]==b[0]) return a[1]-b[1];
            else return a[0]-b[0];
        });
        for(int[] i : intervals){
            pq.add(i);
        }
        List<int[]> lst = new ArrayList<>();
        while(pq.size()>1){
            int[] a = pq.poll();
            int[] b = pq.poll();
            if(a[1]>=b[0]){
                pq.add(new int[]{a[0],Math.max(a[1],b[1])});
            }
            else{
                lst.add(a);
                pq.add(b);
            }
        }
        lst.add(pq.poll());
        int[][] ans = new int[lst.size()][2];
        int x = 0;
        for(int[] i: lst){
            ans[x][0]=i[0];
            ans[x][1]=i[1];
            x++;
        }
        return ans;
    }
    // public int[][] merge(int[][] intervals) {
    //     Arrays.sort(intervals, (a,b)-> {
    //         if(a[0]==b[0]) return a[1]-b[1];
    //         else return a[0]-b[0];
    //     });
        
    //     List<int[]> lst = new ArrayList<>();
    //     int[] curr = intervals[0];
        
    //     for(int i = 1; i<intervals.length; i++){
    //         if(curr[1]>=intervals[i][0]){
    //             curr[1] = Math.max(curr[1],intervals[i][1]);
    //         }
    //         else{
    //             lst.add(curr);
    //             curr = intervals[i];
    //         }
    //     }
    //     lst.add(curr);
    //     return lst.toArray(new int[lst.size()][]);
    // }
}
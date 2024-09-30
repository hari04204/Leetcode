class Solution {
    public boolean searchMatrix(int[][] m, int target) {
        int[] row = searchRangeInMatrix(m,target);
        if(row.length==1 && row[0]==target) return true;
        int i = 0;
        int j = row.length - 1;
        while(i <= j){
            int mid = (i + j) / 2;
            if(row[mid] == target) return true;
            if(row[mid] > target) j = mid - 1;
            else i = mid + 1;
        }
        return false;
    }
    public int[] searchRangeInMatrix(int[][] m, int target){
        if(m.length==1) return m[0];
        if(target >= m[m.length - 1][0]){
            return m[m.length - 1];
        }
        int i = 0;
        int j = m.length - 1;
        while(i <= j){
            System.out.println(i+" "+j);
            int mid = (i + j) / 2;
            if(target <= m[mid][m[0].length-1]&& target>=m[mid][0]){
                return m[mid];
            }
            else if(target>m[mid][0]){
                i = mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return m[i];
    }
}
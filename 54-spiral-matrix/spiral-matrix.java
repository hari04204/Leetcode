class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int l = 0;
        int t = 0;
        int r = matrix[0].length;
        int b = matrix.length;
        int i = 0;
        while(l<r&&t<b){
            for(i=l;i<r;i++){
                list.add(matrix[t][i]);
            }
            t++;
            for(i=t;i<b;i++){
                list.add(matrix[i][r-1]);
            }
            r--;
            if(!(l<r&&t<b)){
                break;
            }
            for(i=r-1;i>l-1;i--){
                list.add(matrix[b-1][i]);
            }
            b--;
            for(i=b-1;i>=t;i--){
                list.add(matrix[i][l]);
            }
            l++;
        }
        return list;
    }
}
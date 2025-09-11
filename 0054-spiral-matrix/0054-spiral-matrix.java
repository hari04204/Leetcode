class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        int r = matrix[0].length;
        int l = -1;
        int t = -1;
        int b = matrix.length;
        int count = 0;
        int total = b*r;
        char dir='r';
        while(count<total){
            ans.add(matrix[i][j]);
            count++;
            if(dir=='r' && j+1==r){
                dir='d';
                i++;
                t++;
            }
            else if(dir=='d' && i+1==b){
                dir='l';
                j--;
                r--;
            }
            else if(dir=='l' && j-1==l){
                dir='u';
                i--;
                b--;
            }
            else if(dir=='u' && i-1==t){
                dir='r';
                j++;
                l++;
            }
            else if(dir=='r') j++;
            else if(dir=='d') i++;
            else if(dir=='l') j--;
            else if(dir=='u') i--;
        }
        return ans;
    }
}
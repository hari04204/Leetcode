class Solution {
    public void rotate(int[][] matrix) {
        flipMatrix(matrix);
        for(int[] a: matrix){
            int i = 0;
            int j = a.length-1;
            while(i<j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
    }
    public void flipMatrix(int[][] arr){
        int top = 0;
        int left = 0;
        int right = arr.length;
        int bottom = arr.length;
        int n = arr.length;
        while(top < n/2){
            for(int i = left;i<right;i++){
                int temp = arr[top][i];
                arr[top][i] = arr[i][top];
                arr[i][top] = temp;
            }
            top++;
            left++;
            for(int i = top;i<bottom;i++){
                int temp = arr[i][right-1];
                arr[i][right-1] = arr[right-1][i];
                arr[right-1][i] = temp;
            }
            bottom--;
            right--;
        }
    }
}
/*
  l          r
t 1  2  3  4
  5  6  7  8
  9  10 11 12
  13 14 15 16
b
*/
class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[] height = new int[matrix[0].length];
        int max = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]=='1')height[j]++;
                else height[j] = 0;
            }
            max = Math.max(max, largestRectangleArea(height));
        }
        return max;
    }
    public int largestRectangleArea(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i<n; i++){
            while(!stk.isEmpty() && height[stk.peek()]>=height[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                left[i] = -1;
            }
            else{
                left[i] = stk.peek();
            }
            stk.push(i);
        }
        stk.clear();
        for(int i=n-1; i>=0; i--){
            while(!stk.isEmpty() && height[stk.peek()]>=height[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                right[i] = n;
            }
            else{
                right[i] = stk.peek();
            }
            stk.push(i);
        }
        int max = 0;
        for(int i = 0; i<n; i++){
            int w = right[i]-left[i]-1;
            max = Math.max(max,w*height[i]);
        }
        return max;
    }
}
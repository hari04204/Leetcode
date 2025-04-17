class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxLen = 0;
        for(int i = 0; i<rectangles.length; i++){
            maxLen = Math.max(Math.min(rectangles[i][0], rectangles[i][1]),maxLen);
        }
        int count = 0;
        for(int i = 0; i<rectangles.length; i++){
            int minLen = Math.min(rectangles[i][0], rectangles[i][1]);
            if(minLen>=maxLen) count++;
        }
        return count;
    }
}
class Solution {
    public int trap(int[] h) {
        int[] l = new int[h.length];
        int[] r = new int[h.length];
        int maxl = 0;
        int maxr = 0;
        for(int i = 0; i<h.length; i++){
            if(h[i]>maxl){
                maxl = h[i];
            }
            l[i] = maxl;
            if(h[h.length-1-i]>maxr){
                maxr = h[h.length-1-i];
            }
            r[h.length-1-i] = maxr;
        }
        int maxVol = 0;
        for(int i = 0; i<h.length; i++){
            maxVol += (Math.min(l[i],r[i]) - h[i]);
        }
        return maxVol;
    }
}
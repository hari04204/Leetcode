class Solution {
    public int maxArea(int h, int w, int[] hc, int[] vc) {
        Arrays.sort(hc);
        Arrays.sort(vc);
        int maxh = Math.max(hc[0], h-hc[hc.length-1]);
        int maxw = Math.max(vc[0], w-vc[vc.length-1]);
        for(int i = 1; i<hc.length; i++){
            maxh = Math.max(maxh, hc[i]-hc[i-1]);
        }
        for(int i = 1; i<vc.length; i++){
            maxw = Math.max(maxw, vc[i]-vc[i-1]);
        }
        return (int) ((long) maxh * maxw % 1000000007);
    }
}
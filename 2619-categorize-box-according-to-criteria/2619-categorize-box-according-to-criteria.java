class Solution {
    public String categorizeBox(int l, int w, int h, int m) {
        int b = 10000;
        boolean isBulky = false;
        boolean isHeavy = false;
        if(l >= b || w >= b || h >= b || m >= b || (long)l*w*h >= 1000000000) isBulky = true;
        if(m >= 100) isHeavy = true;
        if(isBulky && isHeavy) return "Both";
        else if(isBulky && !isHeavy) return "Bulky";
        else if(!isBulky && isHeavy) return "Heavy";
        else return "Neither";
    }
}
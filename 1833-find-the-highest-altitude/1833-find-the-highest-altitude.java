class Solution {
    public int largestAltitude(int[] gain) {
        int alt = 0;
        int max = 0;
        for(int i : gain){
            alt+=i;
            max = Math.max(alt,max);
        }
        return max;
    }
}
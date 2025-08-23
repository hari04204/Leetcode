class Solution {
    public long minimumPerimeter(long neededApples) {
        long l=1;
        long r= (long)1e5;
        while(l<r){
            long mid = l+(r-l)/2;
            long ans = (mid*(mid+1)/2) * (1+2*mid);
            if(ans*4<neededApples) l=mid+1;
            else r=mid;
        }
        return 8*r;
    }
}
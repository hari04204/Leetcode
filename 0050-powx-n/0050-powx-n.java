class Solution {
    public double myPow(double x, long n) {
        return calc_power(x,(long)n);
    }
    public double calc_power(double x, long n){
        if(x==0) return 0;
        if(n==0) return 1;
        if(n<0){
            return 1.0/calc_power(x,-n);
        }
        if(n%2==1) return x*calc_power(x*x,(n-1)/2);
        else return calc_power(x*x,n/2);
    }
}
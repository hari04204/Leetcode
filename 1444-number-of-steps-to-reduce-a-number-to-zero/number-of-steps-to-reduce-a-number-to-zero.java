class Solution {
    public int numberOfSteps(int num) {
        return helper(num);
    }
    public int helper(int num){
        int steps = 0;
        return count(num,steps);
    }
    public int count(int num, int steps){
        if(num==0) return 0;
        if(num/2==0) return steps+1;
        if(num%2==0){
            return count(num/2,steps+1);    
        }
        else{
            return count(num/2,steps+2);
        }
    }
}
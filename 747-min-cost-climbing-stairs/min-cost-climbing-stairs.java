class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        int one = cost[0];
        int two = cost[1];
        int three;
        for(int i = 2;i<cost.length;i++){
            three = Math.min(two,one)+cost[i];
            one=two;
            two=three;
        }
        return Math.min(one,two);
    }
}
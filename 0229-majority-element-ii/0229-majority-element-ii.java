class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int m1 = 0;
        int m2 = 0;
        int c1 = 0;
        int c2 = 0;
        for(int num: nums){
            if(num==m1) c1++;
            else if(num==m2) c2++;
            else if(c1==0){
                m1 = num;
                c1++;
            } 
            else if(c2==0){
                m2 = num;
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for(int num: nums){
            if(num==m1) c1++;
            else if(num==m2) c2++;
        }

        List<Integer> res = new ArrayList<>();
        if(c1>nums.length/3) res.add(m1);
        if(c2>nums.length/3) res.add(m2);
        return res;
    }
}
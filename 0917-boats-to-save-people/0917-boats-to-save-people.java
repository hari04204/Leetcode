class Solution {
    public int numRescueBoats(int[] people, int limit) {
        if(people.length==0) return 0;
        int boats = 0;
        Arrays.sort(people);
        int i = 0;
        int j = people.length-1;
        while(i<=j){
            if(people[i]+people[j]>limit){
                j--;
                boats++;
            }
            else{
                boats++;
                i++;
                j--;
            }
        }
        return boats;
    }
}
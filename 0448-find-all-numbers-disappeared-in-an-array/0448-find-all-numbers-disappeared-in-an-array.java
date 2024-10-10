class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] arr = new boolean[nums.length];
        for(int i: nums){
            arr[i-1] = true;
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i< arr.length; i++){
            if(arr[i]== false){
                res.add(i+1);
            }
        }
        return res;
    }
}
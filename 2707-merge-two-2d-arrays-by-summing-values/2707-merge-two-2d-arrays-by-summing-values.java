class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int[] row: nums1){
            map.put(row[0],row[1]);
        }
        for (int[] i : nums2){
            if (map.containsKey(i[0])){
                map.put(i[0],map.get(i[0])+i[1]);
            }
            else{
                map.put(i[0],i[1]);
            }
        }
        int[] arr = new int[map.size()];
        int x = 0;
        for(int i: map.keySet()){
            arr[x] = i;
            x++;
        }
        Arrays.sort(arr);
        int[][] ans = new int[map.size()][2];
        for(int i=0; i<map.size(); i++){
                ans[i] = new int[]{arr[i],map.get(arr[i])};
        }
        return ans;
    }
}
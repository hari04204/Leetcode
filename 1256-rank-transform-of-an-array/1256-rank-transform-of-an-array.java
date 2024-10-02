class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        SortedSet<Integer> set = new TreeSet<>();
        for(int i: arr){
            set.add(i);
        }
        int[] ind = new int[set.size()];
        int x = 0;
        for(Integer i: set){
            ind[x] = i;
            x++;
        }
        for(int i = 0; i<ind.length; i++){
            map.put(ind[i],i);
        }
        for(int i = 0; i<arr.length; i++){
            arr[i] = map.get(arr[i])+1;
        }
        return arr;
    }
}
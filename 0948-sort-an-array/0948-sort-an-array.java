class Solution {
    public int[] sortArray(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = sortArray(Arrays.copyOfRange(arr,0,mid));
        int[] right = sortArray(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    public static int[] merge(int[] one, int[] two){
        int[] res = new int[one.length+two.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<one.length && j<two.length){
            if(one[i]<two[j]){
                res[k]= one[i];
                i++;
            }
            else{
                res[k] = two[j];
                j++;
            }
            k++;
        }
        while(i<one.length){
            res[k] = one[i];
            i++;
            k++;
        }
        while(j<two.length){
            res[k] = two[j];
            j++;
            k++;
        }
        return res;
    }
}
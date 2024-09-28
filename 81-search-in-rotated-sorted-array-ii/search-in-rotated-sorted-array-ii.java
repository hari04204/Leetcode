class Solution {
    public boolean search(int[] arr, int target) {
        return search2(arr,target,0,arr.length-1);
        // int start = 0;
        // int end = arr.length-1;
        // while(start<=end){
        //     int mid = start + (end - start)/2;
        //     System.out.println(mid);
        //     if(arr[mid] == target) return true;
        //     if(arr[start]==arr[mid] && arr[mid] == arr[end]){
        //         start++;
        //         end--;
        //     }
        //     else if(arr[start]<=arr[mid]){
        //         if(arr[start] <= target && arr[mid] >= target){
        //             end = mid-1;
        //         }
        //         else{
        //             start = mid+1;
        //         }
        //     }
        //     else{
        //         if(target >= arr[mid] && target <= arr[end]){
        //             start = mid+1;
        //         }
        //         else{
        //             end = mid-1;
        //         }
        //     }
        // }
        // return false;
    }
    public boolean search2(int[] arr, int target, int start, int end){
        if(start>end) return false;
        int mid =(start+end)/2;
        if(arr[mid]== target) return true;
        if(arr[start]==arr[mid] && arr[mid] == arr[end]){
                return search2(arr, target, start+1, end-1);
        }
        else if(arr[start]<=arr[mid]){
            if(arr[start] <= target && arr[mid] >= target){
                return search2(arr, target, start, mid-1);
            }
            else{
                return search2(arr, target, mid+1, end);
            }
        }
        else{
            if(target >= arr[mid] && target <= arr[end]){
                return search2(arr, target, mid+1, end);
            }
            else{
                return search2(arr, target, start, mid-1);
            }
        }
    }
}
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray a) {
        int peakIndex = peakIndexInMountainArray(a);
        int start = 0;
        int end = peakIndex;
        if(target == a.get(0)) return 0;
        if(target == a.get(peakIndex)) return peakIndex;
        while(start<end){
            int mid = start + (end-start)/2;
            if(a.get(mid) > target){
                end = mid;
            }
            else if(a.get(mid) < target){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        if(target == a.get(a.length()-1)) return a.length()-1;
        start = peakIndex;
        end = a.length()-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(a.get(mid) < target){
                end = mid-1;
            }
            else if(a.get(mid) > target){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }
    public int peakIndexInMountainArray(MountainArray a) {
        int start = 0;
        int end = a.length()-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(a.get(mid) > a.get(mid+1)){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}
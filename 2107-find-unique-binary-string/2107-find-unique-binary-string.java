class Solution {
    public String findDifferentBinaryString(String[] arr) {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i<arr.length; i++){
            if(arr[i].charAt(i)=='0') res.append('1');
            else res.append('0');
        }
        return res.toString();
    }
}
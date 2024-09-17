class Solution {
    public int lengthOfLastWord(String s) {
        String[] a = s.trim().split(" ");
        int index = a.length-1;
        return a[index].length();
        
    }
}
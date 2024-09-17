class Solution {
    public int lengthOfLastWord(String s) {
        String[] a = s.split(" ");
        int index = a.length-1;
        if(a[index] != " ") return a[index].length();
        while(true){
            if(a[index] == " "){
                index--;
            }
            else return a[index].length();
        }
    }
}
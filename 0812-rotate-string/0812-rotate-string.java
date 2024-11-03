class Solution {
    public boolean rotateString(String s, String goal) {
    //     for(int i = 0; i<s.length(); i++){
    //         s = rotate(s);
    //         if(s.equals(goal)){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    // public String rotate(String s){
    //     s = s.substring(1) + s.charAt(0);
    //     System.out.println(s);
    //     return s;
    // }
        if(s.length()!=goal.length()) return false;
        s = s+s;
        return s.contains(goal);
    }
}
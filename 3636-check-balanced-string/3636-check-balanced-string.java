class Solution {
    public boolean isBalanced(String num) {
        int odd = 0;
        int even = 0;
        for(int i = 0; i<num.length(); i++){
            if(i%2==0){
                even += Integer.parseInt(num.charAt(i)+"");
            }
            else{
                odd += Integer.parseInt(num.charAt(i)+"");
            }
        }
        return odd == even;
    }
}
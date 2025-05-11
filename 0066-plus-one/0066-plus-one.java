class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int num = digits[n-1];
        if(num==9){
            digits[n-1] = 0;
            int carry = 1;
            for(int i = n-2; i>=0; i--){
                int x = digits[i]+carry;
                carry = x/10;
                digits[i]=x%10;
            }
            if(carry == 1){
                int[] ans = new int[n+1];
                ans[0]=1;
                int x = 0;
                while(x<n){
                    ans[x+1]=digits[x];
                    x++;
                }
                return ans;
            }
            return digits;
        }
        else{
            digits[n-1]++;
            return digits;
        }
    }
}
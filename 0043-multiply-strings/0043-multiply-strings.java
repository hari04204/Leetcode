class Solution {
    public String multiply(String num1, String num2) {
        if("0".equals(num1) || "0".equals(num2)) return "0";
        int m = num1.length();
        int n = num2.length();
        int[] ans = new int[m+n];

        for(int i = m-1; i>=0; i--){
            for(int j = n-1; j>=0; j--){
                int mul = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
                int pos1 = i+j+1;
                int pos2 = i+j;
                mul += ans[pos1];
                ans[pos1] = mul%10;
                ans[pos2] += mul/10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int x: ans) if(!(sb.length()==0 && x==0)) sb.append(x);
        return (sb.length()==0)? "0": sb.toString();
    }
}
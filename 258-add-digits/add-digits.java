class Solution {
    public int addDigits(int num) {
        int temp = num;
        while(temp>9){
            int ntemp = 0, rem;
            while(temp != 0){
                rem = temp%10;
                ntemp += rem;
                temp /= 10;
            }
            temp = ntemp;
        }
        return temp;
    }
}
class Solution {
    public int maxNumberOfBalloons(String text) {
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        int count = 0;
        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if(c=='b') b++;
            else if(c=='a') a++;
            else if(c=='l') l++;
            else if(c=='o') o++;
            else if(c=='n') n++;
        }
        while(b!=0){
            b--;
            a--;
            l-=2;
            o-=2;
            n--;
            if(a>=0 && l>=0 && o>=0 && n>=0) count++;
        }
        return count;
    }
}
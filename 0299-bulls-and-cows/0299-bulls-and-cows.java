class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] freq1 = new int[10];
        int[] freq2 = new int[10];
        for(int i = 0; i<secret.length(); i++){
            freq1[(secret.charAt(i)-'0')]++;
            freq2[(guess.charAt(i)-'0')]++;
        }
        for(int i = 0; i<secret.length(); i++){
            if(secret.charAt(i)==guess.charAt(i)){
                freq2[guess.charAt(i)-'0']--;
                freq1[guess.charAt(i)-'0']--;
                bulls++;
            }
        }
        for(int i = 0; i<10; i++){
            if(freq2[i]!=0) cows+= Math.min(freq1[i],freq2[i]);
        }
        return bulls+"A"+cows+"B";
    }
}
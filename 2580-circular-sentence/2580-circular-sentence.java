class Solution {
    public boolean isCircularSentence(String sentence) {
        int k = 0;
        char c = sentence.charAt(0);
        while(sentence.contains(" ")){
            k = sentence.indexOf(" ");
            if(k != -1 && sentence.charAt(k-1) != sentence.charAt(k+1)){
                return false;
            }
            sentence = sentence.substring(k+1);
        }
        return c==sentence.charAt(sentence.length()-1);
    }
}
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 0;
        int end = n;
        if(guess(n)==0){
                return n;
            }
        while(start<end){
            int pick = start + (end - start)/2;
            System.out.println(pick);
            if(guess(pick)==0){
                return pick;
            }
            if(guess(pick)<0) end = pick-1;
            if(guess(pick)>0) start = pick+1;
        }
        return start;
    }
}
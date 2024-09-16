class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 1 && flowerbed[0]==0 & n<=1) return true;
        else if(flowerbed.length == 1 && flowerbed[0]==0 & n>1) return false;
        int count = n;
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0){
                if(i != 0 && i != flowerbed.length - 1 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0){
                    count--;
                    flowerbed[i] = 1;
                }  
                if(i == 0 && flowerbed[i + 1] == 0){
                    count--;
                    flowerbed[i] = 1;
                } 
                if(i == flowerbed.length-1 && flowerbed[i - 1] == 0){
                    count--;
                    flowerbed[i] = 1;
                } 
            }
        }
        System.out.println(Arrays.toString(flowerbed));
        return count <=0;
    }
}
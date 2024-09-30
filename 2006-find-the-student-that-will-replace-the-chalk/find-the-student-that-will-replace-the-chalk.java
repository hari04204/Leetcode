class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        if(chalk.length==1) return 0;
        long sum = 0;
        for(int i: chalk) sum+=i;
        k%=sum;
        for(int i = 0; i<chalk.length;i++){
            if(chalk[i]>k) return i;
            k-=chalk[i];
        }
        return -1;
    }
}
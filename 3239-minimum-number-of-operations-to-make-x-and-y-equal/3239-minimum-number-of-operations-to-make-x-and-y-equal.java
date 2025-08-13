class Solution {
    public int minimumOperationsToMakeEqual(int x, int y) {
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        q.add(x);
        set.add(x);
        int MAX = 10000;
        int ops = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int num = q.poll();
                if (num == y)
                    return ops;
                if (num % 5 == 0 && isValid(num/5, set, MAX))
                    q.add(num / 5);
                if (num % 11 == 0 && isValid(num/11, set, MAX))
                    q.add(num / 11);
                if (num >= 1 && isValid(num-1, set, MAX))
                    q.add(num - 1);
                if(isValid(num+1, set,MAX))q.add(num + 1);
            }
            ops++;
        }
        return -1;
    }
    public boolean isValid(int num, Set<Integer> set, int MAX){
        return num>=0  && num<=MAX && set.add(num);
    }
}
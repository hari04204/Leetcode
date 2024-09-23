class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();
        int x = 0, y = 0;
        set.add("0,0");
        for(int i = 0; i<path.length(); i++){
            switch(path.charAt(i)){
                case 'N': y++;
                break;
                case 'E': x++;
                break;
                case 'W': x--;;
                break;
                case 'S': y--;
            }
            String str = x+","+y;
            if(set.add(str)==false) return true;
        }
        return false;
    }
}
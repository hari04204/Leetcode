class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size()==1) return triangle.get(0).get(0);
        int min = Integer.MAX_VALUE;
        for(int i = 1; i<triangle.size(); i++){
            for(int j = 0; j<triangle.get(i).size(); j++){
                int x = triangle.get(i).get(j);
                if(j==0){
                    x += triangle.get(i-1).get(0);
                }
                else if(j==triangle.get(i).size()-1){
                    x += triangle.get(i-1).get(j-1);
                }
                else {
                    x+= Math.min(triangle.get(i-1).get(j-1),triangle.get(i-1).get(j));
                }
                triangle.get(i).set(j,x);
            }
        }
        for(int i: triangle.get(triangle.size()-1)){
            min = Math.min(i,min);
        }
        return min;
    }
}
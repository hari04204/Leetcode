class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<>();
        for(int i=1; i<n+1;i++){
            if(i%3==0){
                if(i%5==0){
                    list.add("FizzBuzz");
                }
                else{
                    list.add("Fizz");
                }
            }
            else if(i%5==0){
                list.add("Buzz");
            }
            else{
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
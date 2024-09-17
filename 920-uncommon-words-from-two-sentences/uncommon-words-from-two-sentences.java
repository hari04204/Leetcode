class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] a = s1.split(" ");
        String[] b = s2.split(" ");
        ArrayList<String> res = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(String s: a){
            if(map.containsKey(s)) map.put(s, map.get(s)+1);
            else map.put(s, 1);
        }
        for(String s: b){
            if(map.containsKey(s)) map.put(s, map.get(s)+1);
            else map.put(s, 1);
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                res.add(entry.getKey());
            }
        }
        return res.toArray(String[]::new);
    }
}
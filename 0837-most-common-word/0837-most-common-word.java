class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String,Integer> m = new HashMap<>();
        String [] s = paragraph.split("[^a-zA-Z]+");
        for(String o : s){
            m.put(o.toLowerCase(),m.getOrDefault(o.toLowerCase(),0)+1);
        }
        for(String b : banned){
            m.remove(b);
        }
        String ans = null;
        int count=0;
        for(Map.Entry<String,Integer> mm : m.entrySet()){
            if(mm.getValue()>count){
                count = mm.getValue();
                ans = mm.getKey();
            }
        }
        return ans;

    }
}
class Solution {
    public int mirrorFrequency(String s) {
        
        Map<Character,Integer>map=new HashMap<>();
        int n=s.length();

        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int res=0;
        int max=0;

        for(var e:map.entrySet()){
            
            char c=e.getKey();
            int freq=e.getValue();
            char inv;

            if(Character.isLetter(c)){
                inv=(char)('a'+'z'-c);
            }
            else{
                inv=(char)('0'+'9'-c);
            }
            if(c<=inv){
                res+=Math.abs(freq-map.getOrDefault(inv,0));
            }
            else if(!map.containsKey(inv)){
                res+=freq;
            }
        }
        return res;
    }
}
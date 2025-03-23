class Solution {
    public boolean isSubsequence(String s, String t) {
        int singlePointer = 0;
        int topPointer = 0;
        while(singlePointer <s.length() && topPointer<t.length()){
            if(s.charAt(singlePointer)==t.charAt(topPointer)){
                singlePointer++;
            }
            topPointer++;

        }
        return singlePointer==s.length();
        
    }
}
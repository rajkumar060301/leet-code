class Solution {
    public String reformat(String s) {
        StringBuilder sbletter = new StringBuilder();
        StringBuilder sbnumber = new StringBuilder();
        for(int i =0; i < s.length(); i++ ){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                sbletter.append(ch);
            }else{
                sbnumber.append(ch);
            }
        }
        if(Math.abs(sbletter.length()-sbnumber.length())>1){
            return "";
        }
        StringBuilder ans = new StringBuilder();
        boolean isLetter = true;
        
        if(sbletter.length()<sbnumber.length()) isLetter = false;
        int lIndex=0, nIndex=0;
        for(int i =0; i < s.length(); i++ ){
            if(isLetter){
                ans.append( sbletter.charAt(lIndex) );
                lIndex++;
            }else{
                ans.append( sbnumber.charAt(nIndex) );
                nIndex++;
            }
            isLetter = !isLetter;
        }
        return ans.toString();
    }
}
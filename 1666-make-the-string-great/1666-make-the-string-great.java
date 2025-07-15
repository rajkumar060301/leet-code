class Solution {
    public String makeGood(String s) {
        int len = s.length();
        if(len == 1){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<len; i++){
            int sbLen = sb.length() - 1;
            if(sbLen+1 != 0 && (sb.charAt(sbLen) == s.charAt(i)+32 || sb.charAt(sbLen) == s.charAt(i)-32)){
                sb.deleteCharAt(sbLen);
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
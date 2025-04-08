class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder str = new StringBuilder();
        for(String st : words){
            str.append(st);
            if(str.length()>s.length()){
                break;
            }
            if(str.toString().equals(s)){
                return true;
            }
        }

        return false;
        
    }
}
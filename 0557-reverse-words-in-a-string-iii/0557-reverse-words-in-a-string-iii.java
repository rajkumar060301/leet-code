class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
      
        String[] words = s.split(" ");
      
        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; --i) {
                result.append(word.charAt(i));
            }
            result.append(" ");
        }
      
        return result.substring(0, result.length() - 1);
        
    }
}
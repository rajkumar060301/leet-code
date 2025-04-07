class Solution {
    public String truncateSentence(String s, int k) {
      
        String[] array = s.split(" ");

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < k; i++) {
            result.append(array[i]);
            if (i < k - 1) {
                result.append(" ");
            }
        }

       return result.toString();  
    }
}
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder resultBuilder = new StringBuilder();
        for (char character : s.toCharArray()) {
            int currentLength = resultBuilder.length();

            if (currentLength > 0 && resultBuilder.charAt(currentLength - 1) == character) {
                resultBuilder.deleteCharAt(currentLength - 1);
            } else {
                resultBuilder.append(character);
            }
        }

        return resultBuilder.toString();
        
    }
}
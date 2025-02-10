class Solution {
    public String shiftingLetters(String s, int[] shifts) {
       char[] characters = s.toCharArray();
        int length = characters.length;
        long totalShifts = 0;
      
        for (int i = length - 1; i >= 0; --i) {
            totalShifts += shifts[i];
            int newPosition = (int) ((characters[i] - 'a' + totalShifts) % 26);
            characters[i] = (char) ('a' + newPosition);
        }
      
        return new String(characters);
    }
}
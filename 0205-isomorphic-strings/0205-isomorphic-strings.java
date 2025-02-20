class Solution {
    public boolean isIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        Map<Character, Integer> m1 = new HashMap<>();
      
        Map<Character, Integer> m2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
          
            m1.putIfAbsent(s1.charAt(i), i);
            m2.putIfAbsent(s2.charAt(i), i);

            if (!m1.get(s1.charAt(i)).equals(m2.get(s2.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
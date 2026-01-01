class Solution {
    public boolean isAnagram(String s, String t) {
        String str1 = s.toLowerCase();
        String str2 = t.toLowerCase();
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        if(charArr1.length == charArr2.length &&  Arrays.equals(charArr1, charArr2)){
            return true;
        }
        return false;
    }
}
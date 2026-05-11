class Solution {
    public int minDeletion(String s, int k) {
        int arr[] = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        Arrays.sort(arr);
        int count = 0, i = 0;
        while (i < 26 - k) {
            if (arr[i] != 0) {
                count += arr[i];
            }
            i++;
        }
        return count;
    }
}
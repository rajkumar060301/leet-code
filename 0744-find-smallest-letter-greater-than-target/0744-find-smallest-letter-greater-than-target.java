class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            mid = (int) Math.floor(mid);
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return  arr[start % arr.length];   
        }
}
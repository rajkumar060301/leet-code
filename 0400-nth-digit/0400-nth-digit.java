class Solution {
    public int findNthDigit(int n) {
        int digitLength = 1;
        long count = 9;
        long start = 1;
        while (n > digitLength * count) {
            n -= digitLength * count;
            digitLength++;
            count *= 10;
            start *= 10;
        }
        long num = start + (n - 1) / digitLength;
        String numStr = Long.toString(num);
        return numStr.charAt((n - 1) % digitLength) - '0';
    }
}
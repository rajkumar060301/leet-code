class Solution {
    public boolean isPerfectSquare(int n) {
        if (n == 0) return true;
        int odd = 1;
        while (n > 0) {
            n -= odd;
            odd += 2;
        }
        return n == 0;

    }
}
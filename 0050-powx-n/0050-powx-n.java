class Solution {
    public double myPow(double x, int n) {
        // Base Case
        if (n == 0) return 1;

        // Handle Negative n
        if (n < 0) {
            x = 1 / x;
            // Edge Case: Integer.MIN_VALUE (-2147483648)
            // If we do -n, it overflows. So we handle one multiplication manually.
            if (n == Integer.MIN_VALUE) {
                return x * myPow(x, Integer.MAX_VALUE);
            }
            n = -n;
        }

        // Recursive Step: Even vs Odd
        if (n % 2 == 0) {
            double half = myPow(x, n / 2);
            return half * half;
        } else {
            return x * myPow(x, n - 1);
        }
    }
}
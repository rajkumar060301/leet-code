class Solution {
    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {   // Iterate through all possible values of `a`
            double b = Math.sqrt(c - a * a);  // Compute `b` as the square root of `c - a^2`
            if (b == (int)b) {                 // Check if `b` is an integer
                return true;                   // If `b` is an integer, return true
            }
        }
        return false; 
        
    }
}
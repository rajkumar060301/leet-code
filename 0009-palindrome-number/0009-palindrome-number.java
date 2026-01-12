class Solution {
    public boolean isPalindrome(int x) {
        if(0 > x) return false;
        int original = x;
        int add = 0;

        while(x > 0){
            int rem = x % 10;
            add = (add * 10) + rem;
            x = x / 10;
        }
        if(add == original) {
            return true;
        } 
        return false;
        
    }
}
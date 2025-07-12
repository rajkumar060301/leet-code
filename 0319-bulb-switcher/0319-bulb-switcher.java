class Solution {
    public int bulbSwitch(int n) {
        if(n==0) return 0;
        int a = 1;
        int x = 3;
        int curr = 1;
        while(curr + x - 1 < n){
            curr +=x;
            x +=2;
            a++;
        }

        return a;
    }
    
}
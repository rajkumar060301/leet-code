class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        int[] facts = {2,3,5};
        for(int fact : facts){
            while(n%fact==0){
                n/= fact;
            }
        }

        return n==1;

    }
}
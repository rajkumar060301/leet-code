class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int ans = 0;
        int n = batteryPercentages.length;
        for(int i =0; i<n;i++){
            if(batteryPercentages[i]-ans>0){
                ans+=1;
            }
        }
        return ans;
        
    }
}
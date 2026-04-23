class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int ans=-1;
        for(int i=0;i<capacity.length;i++)
        {

            int s=capacity[i]-itemSize;
            if(s==0) return i;
            else if(s>0)
            { 
                if(ans==-1) ans=i;
                else
                {
                    int temp=capacity[ans]-itemSize;
                    if(s<temp) ans=i;
                }
            }  
        }
        return ans;
    }
}
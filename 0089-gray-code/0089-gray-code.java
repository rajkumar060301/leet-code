class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans=new ArrayList<>();
        int lim=1<<n;
        for(int i=0;i<lim;i++)
        {
            ans.add(i^(i>>1));
        }  
        return ans;
    }
}
class Solution {
    public int findDist(String word1,String word2,int i,int j,int[][] dp)
    {
        if(i<0 ) return j+1;
        if(j<0) return i+1;
         if(dp[i][j]!=-1)return dp[i][j];

        char c1=word1.charAt(i);
        char c2=word2.charAt(j);
        int ins,rep,del;
        if(c1==c2)
          {
            return dp[i][j] = findDist(word1,word2,i-1,j-1,dp);
          }
          else{
              ins=1+findDist(word1,word2,i,j-1,dp) ;
               rep=1+findDist(word1,word2,i-1,j-1,dp);
               del=1+findDist(word1,word2,i-1,j,dp);
           
          }
          return dp[i][j] =  Math.min(ins,Math.min(rep,del));

    }
    public int minDistance(String word1, String word2) {
        int l1=word1.length();
        int l2=word2.length();

        int[][] dp =new int[l1][l2];
        for(int[] a:dp)
        {
            Arrays.fill(a,-1);
        }
         return  findDist(word1,word2,l1-1,l2-1,dp);
    }
        

        
    
}
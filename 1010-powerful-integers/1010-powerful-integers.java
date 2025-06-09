class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
            
            HashSet<Integer> set=new HashSet<>();
            
            int pow1=1;
            
            while(pow1<bound){
                int pow2=1;
                
                while(pow1 + pow2 <= bound){
                    set.add(pow1+pow2);
                    pow2*=y;
                    if(y==1) break;
                }
                
                pow1*=x;
                if(x==1) break;
            }
            return new ArrayList<>(set);
        }
}
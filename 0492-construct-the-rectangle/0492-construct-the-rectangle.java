class Solution {
    public int[] constructRectangle(int area) {
        int x=(int)Math.sqrt(area);
        int l=0;
        int w=0;
        while(x>=1){
            if(area%x==0){
                w=x;
                l=area/x;
                break;
            }
            x--;
        }
        return new int[]{l,w};
    }
}
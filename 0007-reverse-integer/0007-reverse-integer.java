class Solution {
    public int reverse(int x) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        long sum =0;
        while(x != 0){
            long remain = x%10;
            sum = (sum * 10) + remain;
            x = x/10;
        }
        if(sum>max || sum < min) return 0;
        return (int) sum;

        // String str = String.valueOf(x);
        // StringBuilder sb = new StringBuilder(str);
        // String revString = sb.reverse().toString();
        // int value = Integer.parseInt(revString);




        
    }
}
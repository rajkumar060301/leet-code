class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int totalIntervals = intervals.length;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int prevEnd = intervals[0][1];
        int cnt=1;
        for(int i=1;i<totalIntervals;i++){
     
            if(intervals[i][0]>=prevEnd){
                cnt++;
                prevEnd = intervals[i][1]; 
            }
        }
        return totalIntervals - cnt;
    }
}
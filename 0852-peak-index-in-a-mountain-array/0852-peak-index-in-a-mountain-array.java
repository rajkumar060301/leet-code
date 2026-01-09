class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        int start = 1;
        int end = nums.length;
        int n =nums.length;
        if(nums.length ==1) return 0;
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n-2]) return n-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            mid = (int) Math.floor(mid);
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) return mid;
            else if(nums[mid] < nums[mid-1]) end = mid - 1;
            else if(nums[mid] < nums[mid+1]) start = mid + 1;
        }

        return -1;
    }
}
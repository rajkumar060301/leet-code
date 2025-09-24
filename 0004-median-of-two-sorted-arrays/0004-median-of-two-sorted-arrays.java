class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 1. Merge the two arrays into a single new array.
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];

        System.arraycopy(nums1, 0, merged, 0, m);
        System.arraycopy(nums2, 0, merged, m, n);
        
        // 2. Sort the merged array.
        Arrays.sort(merged);
        
        int totalLength = merged.length;
        
        // 3. Find the median based on whether the total length is even or odd.
        if (totalLength % 2 == 1) {
            // If the length is odd, the median is the middle element.
            return (double) merged[totalLength / 2];
        } else {
            // If the length is even, the median is the average of the two middle elements.
            int mid1 = merged[totalLength / 2 - 1];
            int mid2 = merged[totalLength / 2];
            return ((double) mid1 + (double) mid2) / 2.0;
        }
    }
    
}
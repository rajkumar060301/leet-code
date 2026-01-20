class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int totalSize = m + n;
        int index =0;
        int[] arr = new int[totalSize];
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[index];
            index++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        // Store unique elements from nums1
        for (int num : nums1) {
            set1.add(num);
        }

        // Check for intersection
        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);  // Ensures unique intersection values
            }
        }

        // Convert HashSet to int array
        int[] intersectionArray = new int[result.size()];
        int index = 0;
        for (int num : result) {
            intersectionArray[index++] = num;
        }

        return intersectionArray;
    }
}

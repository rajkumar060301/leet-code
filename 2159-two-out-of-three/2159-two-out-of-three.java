class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        boolean[] bool1 = new boolean[101];
        boolean[] bool2 = new boolean[101];
        boolean[] bool3 = new boolean[101];
        for(int num : nums1) bool1[num] = true;
        for(int num : nums2) bool2[num] = true;
        for(int num : nums3) bool3[num] = true;
        List<Integer> result = new ArrayList<>();

        for(int i=1; i<=100; i++){
            if( (bool1[i] || bool2[i]) && (bool2[i] || bool3[i]) && (bool3[i] || bool1[i]))
                result.add(i);

        }

        return result;

    }
    
}
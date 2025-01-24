class Solution {
    public boolean containsDuplicate(int[] arr) {
        int n = arr.length;

        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < n; i++) {

            if (st.contains(arr[i]))
                return true;
            else
                st.add(arr[i]);
        }

        return false;
        
    }
}
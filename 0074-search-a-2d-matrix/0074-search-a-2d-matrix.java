class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] arr : matrix){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == target) return true;

            }
        }

        return false;
    }
}
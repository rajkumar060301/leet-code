class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0; // Count how many flowers we can plant
        
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) { // Check if current spot is empty
                boolean leftEmpty = (i == 0 || flowerbed[i - 1] == 0); // Check left neighbor
                boolean rightEmpty = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0); // Check right neighbor

                if (leftEmpty && rightEmpty) { // If both neighbors are empty, plant a flower
                    flowerbed[i] = 1;
                    count++; // Increase planted count

                    if (count >= n) return true; // If we have placed enough flowers, return true
                }
            }
        }

        return count >= n; // Return true if we placed all n flowers, otherwise false
    }
}

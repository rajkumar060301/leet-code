package easyLevel;
/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 19 version
 * Date: 15-Jul-23
 */

public class Q35_Search_Insert_Positions {

    public static int searchInsert(int[] nums, int target) {
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            index = nums.length;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6};
        int target = 5;
        System.out.println(searchInsert(array, target));
    }
}

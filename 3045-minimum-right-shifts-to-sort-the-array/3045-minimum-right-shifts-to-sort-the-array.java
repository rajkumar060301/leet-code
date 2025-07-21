import java.util.*;

class Solution {
    public int minimumRightShifts(List<Integer> nums) {
    List<Integer> newList = new ArrayList<>(nums);
    int n = newList.size();
    Collections.sort(newList);
    for(int i = 0; i<n; i++){
        if (nums.equals(newList)) {
            return i;
        } 
        int last = nums.remove(n-1);
        nums.add(0,last);
    }
    return -1;
        
    }
}
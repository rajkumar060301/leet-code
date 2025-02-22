class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        // Reverse the array using two pointers
        while (left < right) {
            // Swap characters at left and right
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            // Move the pointers
            left++;
            right--;
        }
        
        // Print the reversed array
        System.out.println(s);
    }
}

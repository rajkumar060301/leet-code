class Solution {

     public void merge(int nums[], int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int temp[] = new int[high - low + 1]; 
        int index = 0;

        // Merge both halves into temp[]
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp[index++] = nums[left++];
            } else {
                temp[index++] = nums[right++];
            }
        }

        // Copy remaining elements from left half
        while (left <= mid) {
            temp[index++] = nums[left++];
        }

        // Copy remaining elements from right half
        while (right <= high) {
            temp[index++] = nums[right++];
        }

        // Copy sorted elements back to the original array
        for (int i = 0; i < temp.length; i++) {
            nums[low + i] = temp[i];
        }
    }

    public void mergeSort(int nums[], int low, int high) {
        if (low >= high) { // Base case: single element is already sorted
            return;
        }
        
        int mid = (low + high) / 2;
        mergeSort(nums, low, mid);       // Sort left half
        mergeSort(nums, mid + 1, high);  // Sort right half
        merge(nums, low, mid, high);     // Merge both halves
    }

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums; // Return the sorted array
    } 
    /*
    public int[] sortArray(int[] nums) {
         int n=nums.length;

        /*Selection Sort
        ///outer loop 0 to n-2
        TIME COMPLEXITY --N,N-1,N-2, N-3 , 1,0---SUM OF N ELEMENTS N(N+1)/2   -->(N^2/2       +N/2)==>O(N^2)
        SPACE COMPLEXITY --O(1)
       
        for(int i=0;i<=n-2;i++){
            //inner loop -is to find minimum element 0 to n-1 , 1 to n-1 , 2 to n-1
            int mini=i;
            for(int j=i;j<=n-1;j++){
                ///camparison to find minimum
                if(nums[j]<nums[mini]){
                    mini=j;
                }

            }

            //swap with mini element with the i index
            int temp=nums[i];
            nums[i]=nums[mini];
            nums[mini]=temp;
        }

        return nums; */

        /*Bubble sorting
        ///outer loop 0 to n-1 , 0 to n-2 .....0 to 1
        for(int i=n-1;i>=0;i--){
            //inner loop-0 to  n-2 , n-3 , n-4
            int DidSwapped=0;
            for(int j=0;j<=i-1;j++){
                if(nums[j]>nums[j+1]){
                    //swaps 
                    int temp= nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    DidSwapped++;
                }
              
            }
              if(DidSwapped==0){
                    break;
                }

        }
        return nums; */

        /*Insertion Sort
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && nums[j-1]>nums[j]){
                //swapp
                int temp=nums[j];
                nums[j]=nums[j-1];
                nums[j-1]=temp;

                j--;

            }

        }
        return nums;

       

        






        

    }
    */
}
class Solution {
    public boolean isIdealPermutation(int[] nums) {
        int len = nums.length;

        ArrayList<Integer> list = new ArrayList<>();

        int glb = 0;
        for(int num : nums) {
            if(list.isEmpty()){
                glb = num;
                list.add(num);
                continue;
            }
            int ind = binaryS(list, num);
            glb += (num-ind);
            list.add(ind, num);
        }
        int lcl = 0;
        for(int i = 0;i < len-1;i++){
            if(nums[i] > nums[i+1]) lcl++;
        }
        return lcl == glb;
    }

    public int binaryS(ArrayList<Integer> list, int tar){
        int st = 0;
        int ed = list.size() - 1;

        while(st <= ed){
            int mid = (st + ed) / 2;

            if(list.get(mid) <= tar) st = mid + 1;
            else ed = mid - 1;
        }

        return st;
    }
}
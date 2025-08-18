class Solution {
    public int[] frequencySort(int[] nums) 
    {
        List<Integer> l1 = new ArrayList<>();
        Map<Integer,Integer> m1 = new HashMap<>(); //store freq

        for(int num:nums)
            l1.add(num);
        
        for(int i=0;i<nums.length;i++)
            m1.put(l1.get(i),m1.getOrDefault(l1.get(i),0)+1);

        l1.sort((a,b)->{
            if(!m1.get(a).equals(m1.get(b)))
                return m1.get(a)-m1.get(b); //small freq first
            return b-a; //sort by descending, if freq is same
        });

        int res[] = new int[l1.size()];
        for(int i=0;i<l1.size();i++)
            res[i] = l1.get(i);

        return res;
    }
}
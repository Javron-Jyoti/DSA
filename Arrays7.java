class Arrays7 {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i =0;i<nums.length-1;i++)
        {
            for(int j =i;j<nums.length-1;j++)
            {
                if(nums[i]==nums[j+1])
                {
                    count++;
                }
            }
        }
        return count;
    }
}
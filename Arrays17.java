class Arrays17 {
    public int findNumbers(int[] nums) {
        int count1 = 0;
        for(int i = 0;i<nums.length;i++)
        {
            int count = 0;
            for(int m = nums[i]; m>0 ; m/=10)
            {
                count++;
            }
            if(count%2 == 0)
            {
                count1++;
            }
        }
        return count1;
    }
}
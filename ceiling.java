public class ceiling {
    public static void main(String[] args)
    {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 20;
        int ans = ceiling(arr,target);
        System.out.print(ans);
    }
    static int ceiling(int[] letters, int target)
    {
        if(target > letters[letters.length - 1])
        {
            return -1;
        }
        int start = 0;
        int end = letters.length - 1;
        //find whether the array is sorted in ascending or descending
        boolean isAsc = letters[start] < letters[end];
        while(start<= end)
        {
            int mid = start + (end - start) / 2;//might be possible start + end exceed the range of integer
            if(letters[mid] == target)
            {
                return mid;
            }
            if(isAsc)
            {
                if(target < letters[mid])
                {
                    end = mid - 1;
                }else if (target > letters[mid])
                {
                    start = mid + 1;
                }}else
            {
                if(target > letters[mid])
                {
                    end = mid - 1;
                }else if (target < letters[mid])
                {
                    start = mid + 1;
                }
            }
        }
        return letters[start];
    }
}

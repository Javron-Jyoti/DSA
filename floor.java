public class floor {
    public static void main(String[] args)
    {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 1;
        int ans = floor(arr,target);
        System.out.print(ans);
    }
    static int floor(int[] arr, int target)
    {
        //but what if the target element is greater than the greatest element
        if(target < arr[0])
        {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        //find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];
        while(start<= end)
        {
            int mid = start + (end - start) / 2;//might be possible start + end exceed the range of integer
            if(arr[mid] == target)
            {
                return mid;
            }
            if(isAsc)
            {
                if(target < arr[mid])
                {
                    end = mid - 1;
                }else if (target > arr[mid])
                {
                    start = mid + 1;
                }}else
            {
                if(target > arr[mid])
                {
                    end = mid - 1;
                }else if (target < arr[mid])
                {
                    start = mid + 1;
                }
            }
        }
        return arr[end];
    }
}

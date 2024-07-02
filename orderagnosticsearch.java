public class orderagnosticsearch {
    public static void main(String[] args)
    {
        int[] arr = {98,78,68,24,20,19,8,7,9,0,-4,-8};
        int target = -4;
        int ans = orderAgnosticBS(arr,target);
        System.out.print(ans);
    }
    static int orderAgnosticBS(int[] arr, int target)
    {
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
        return -1;
    }
}

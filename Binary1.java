public class Binary1 {
    public static void main(String[] args)
    {
        int[] arr = {-18,-12,-4,-2,0,7,8,10,18,98};
        int target = 8;
        int ans = binarySearch(arr,target);
        System.out.print(ans);
    }
    static int binarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start<= end)
        {
            int mid = start + (end - start) / 2;//might be possible start + end exceed the range of integer
            if(target < arr[mid])
            {
                end = mid - 1;
            }else if (target > arr[mid])
            {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

public class searchInMountain {
    public static void main(String[] args)
    {

    }
    int search(int[] arr, int target)
    {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr,target,0,peak);
        if(firstTry != -1)
        {
            return firstTry;
        }
        int secondtry = orderAgnosticBS(arr,target,peak,arr.length-1);
        return secondtry;
    }
    public int peakIndexInMountainArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end)
        {
            int mid = start + (end - start)/2 ;
            if(nums[mid] > nums[mid + 1])
            {
                //you are in the decreasing part of the array, you should look in the left of the array
                end = mid;//this is why end!=mid - 1
            }
            else if(nums[mid] < nums[mid+1])
            {
                //you are in the asc part of the array
                start = mid + 1;//because we know that mid + 1 element is greater than middle element
            }
            //in the end the start will be equal to the end because of the two checks we made
        }
        return start;
    }
    static int binarySearch(int[] arr, int target,int start, int end)
    {
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
    static int orderAgnosticBS(int[] arr, int target ,int start, int end)
    {
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


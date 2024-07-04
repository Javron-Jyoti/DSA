import java.util.Arrays;
public class firstandlast {
    public static void main(String[] args)
    {
        int[] arr = {5,7,7,8,8,10};
        int target = 7;
        int[] ans = searchRange(arr,target);
        System.out.print(Arrays.toString(ans));
    }
     static int[] searchRange(int[] nums, int target)
    {
        int[] ans = {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int search(int[] arr, int target, boolean findstartindex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(target < mid)
            {
                end = mid - 1;
            }
            else if (target > mid)
            {
                start  = mid + 1;
            }
            else
            {
                ans = mid;
                if(findstartindex)
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
        }
    return ans;
    }

    }


import java.util.Arrays;
public class Arrays3 {
    public static void main(String[] args)
    {
        int[] nums = {1,1,1,1,1};
        System.out.print("Input:"+Arrays.toString(nums));
        runningSum(nums);
        System.out.print("Output:"+Arrays.toString(nums));
    }
    static int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i =0;i<nums.length;i++)
        {
            if(i == 0)
            {
                arr[i] = nums[0];
            }
            else
            {
                arr[i] = nums[i]+arr[i-1];
            }
        }
        return arr;
    }
}
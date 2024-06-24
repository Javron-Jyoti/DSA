import java.util.Arrays;
class Solution {
    public static void main(String[] args)
    {
        int[] input={1,2,1};
        System.out.print("Input:"+Arrays.toString(input));
        getConcatenation(input);
        System.out.print("Output:"+Arrays.toString(input));
    }
    static int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length*2];
        int n = nums.length;
        for(int i = 0;i<nums.length;i++)
        {
            arr[i] = nums[i];
            arr[i+n] = nums[i];
        }
        return arr;
    }
}

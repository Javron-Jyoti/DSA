import java.util.Arrays;
class Arrays5 {
    public static void main(String args[])
    {
        int[] input = {2,5,1,3,4,7};
        int n = input.length/2;
        shuffle(input,n);
        System.out.println("Output:"+Arrays.toString(input));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int j = 0;
        for(int i = 0;i<nums.length;i+=2)
        {
            arr[i] = nums[j];
            arr[i+1] = nums[j+n];
            j++;
        }
        return arr;
    }
}
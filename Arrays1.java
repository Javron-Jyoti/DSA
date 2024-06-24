import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int[] input = { 0, 1, 2, 4, 5, 3 };
        System.out.print("Input:" + Arrays.toString(input));
        buildArray(input);
        System.out.print("Output:" + Arrays.toString(input));
    }

    static int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;

    }
}
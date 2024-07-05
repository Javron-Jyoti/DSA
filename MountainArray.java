public class MountainArray {
    public static void main(String[] args)
    {

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
}

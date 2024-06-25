import java.util.ArrayList;

class Arrays11 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] result = new int[nums.length];
        ArrayList<Integer> list = new ArrayList<>(nums.length);
        for(int i =0; i<result.length;i++)
        {
            list.add(index[i],nums[i]);
        }
        for(int i =0; i<result.length;i++)
        {
            result[i] = list.get(i);
        }
        return result;
    }

}

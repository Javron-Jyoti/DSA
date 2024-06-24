import java.util.ArrayList;
import java.util.List;

class Arrays6 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        boolean[] arr = new boolean[candies.length];
        int max = candies[0];
        for(int i = 0;i<candies.length;i++)
        {
            if(candies[i]>max)
            {
                max = candies[i];
            }
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies >= max)
            {
                arr[i] = true;
            }
            else
            {
                arr[i] = false;
            }
        }
        List<Boolean> result = new ArrayList<>();
        for (boolean b : arr) {
            result.add(b);
        }
        return result;
    }
}
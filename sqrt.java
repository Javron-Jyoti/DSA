public class sqrt {
    public static void main(String[] args)
    {
        int x = 12;
        System.out.print(mySqrt(x));
    }
    static int mySqrt(int x) {
        if(x < 2)
        {
            return x;
        }
        int start = 0;
        int end = x;

        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if((long)mid*mid<x)
            {
                start = mid+1;
            }
            else if((long)mid*mid>x){
                end = mid-1;
            }
            else
            {
                return mid;
            }
        }
        return start-1;
    }
}

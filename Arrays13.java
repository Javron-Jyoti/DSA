class Arrays13 {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i =0;i<image.length;i++)
        {
            reverse(image[i]);
        }
        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image[i].length;j++)
            {
                image[i][j] = image[i][j] ^ 1;
            }
        }
        return image;

    }
    void reverse(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
class Arrays14 {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] nums = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int indRow = 0; indRow < indices.length; indRow++) {
                nums[indices[indRow][0]][i]++;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int indCol = 0; indCol < indices.length; indCol++) {
                nums[i][indices[indCol][1]]++;
            }
        }

        int ans = 0;
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                if (nums[row][col] % 2 != 0) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
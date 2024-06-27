class Arrays15 {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j || i == mat.length - j - 1) {
                    sum = sum + mat[i][j];
                }

            }
        }
        return sum;
    }
}
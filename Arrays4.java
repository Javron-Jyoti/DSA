import java.util.Arrays;

class Arrays4 {
    public static void main(String[] args) {
        int[][] input = { { 1, 2, 3 }, { 3, 2, 1 } };
        System.out.println("Input:" + Arrays.toString(input));
        int max = maximumWealth(input);
        System.out.println("Output:" + max);
    }

    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth = wealth + accounts[i][j];
            }
            if (wealth > max) {
                max = wealth;
            }
        }
        return max;
    }
}

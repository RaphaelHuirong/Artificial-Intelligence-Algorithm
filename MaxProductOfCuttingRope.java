public class MaxProductOfCuttingRope {
    public int maxProduct(int length) {
        if (length == 2) {
            return 1;
        }
        int[] dp = new int[length + 1];
        dp[1] = 0;
        dp[2] = 1;
        for (int i = 3; i < dp.length; i++) {
            for (int j = 1; j <= i / 2; j++) {
                dp[i] = Math.max(dp[i], j * Math.max(dp[i - j], (i - j)));
            }
        }
        return dp[length];
    }
}

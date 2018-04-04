public class LargeSquareOf1s {
    public int largest(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int max = 0;
        int n = matrix.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    result[i][j] = matrix[i][j];
                } else {
                    if (matrix[i][j] == 1) {
                        result[i][j] = Math.min(result[i - 1][j] + 1, result[i][j - 1] + 1);
                        result[i][j] = Math.min(result[i][j], result[i - 1][j - 1] + 1);
                    }
                }
                max = Math.max(result[i][j], max);
            }
        }
        return max;
    }
}

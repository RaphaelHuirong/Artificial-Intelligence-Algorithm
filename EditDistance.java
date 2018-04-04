public class EditDistance {
    public int editDistance(String one, String two) {
        int[][] result = new int[one.length() + 1][two.length() + 1];
        for (int i = 0; i <= one.length(); i++) {
            result[i][0] = i;
        }
        for (int i = 1; i <= two.length(); i++) {
            result[0][i] = i;
        }
        for (int i = 1; i <= one.length(); i++) {
            for (int j = 1; j <= two.length(); j++) {
                if (one.charAt(i - 1) == two.charAt(j - 1)) {
                    result[i][j] = result[i - 1][j - 1];
                } else {
                    result[i][j] = Math.min(result[i - 1][j], result[i][j - 1]) + 1;
                    result[i][j] = Math.min(result[i][j], result[i - 1][j - 1] + 1);
                }
            }
        }
        return result[one.length()][two.length()];
    }
}

public class LongestAscedingSubArray {
    public int longest(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int result = 1;
        int cur = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                cur++;
                result = Math.max(cur, result);
            } else {
                cur = 1;
            }
        }
        return result;
    }
}

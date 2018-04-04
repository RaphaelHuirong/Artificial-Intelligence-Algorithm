public class LongestConsecutive1s {
    public int longest(int[] array) {
        int result = 0;
        int cur = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                if (i == 0 || array[i - 1] == 0) {
                    cur = 1;
                } else {
                    cur++;
                }
            }
            result = Math.max(cur, result);
        }
        return result;
    }
}

public class LargestSubArraySum {
    public int largestSum(int[] array) {
        int result = array[0];
        int cur = array[0];
        for (int i = 1; i < array.length; i++) {
            if (cur >= 0) {
                cur = cur + array[i];
            } else {
                cur = array[i];
            }
            result = Math.max(result, cur);
        }
        return result;
    }
}

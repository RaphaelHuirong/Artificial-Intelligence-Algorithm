import java.util.List;

public class Percentile95 {
    public int percentile95(List<Integer> lengths) {
        int[] result = new int[4097];
        for (Integer s : lengths) {
            result[s]++;
        }
        int sum = 0;
        int len = 4097;
        while (sum <= 0.05 * lengths.size()) {
            len--;
            sum += result[len];
        }
        return len;
    }
}

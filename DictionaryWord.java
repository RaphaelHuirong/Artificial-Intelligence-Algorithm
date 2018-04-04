import java.util.Set;
import java.util.HashSet;

public class DictionaryWord {
    public boolean canBreak(String input, String[] dict) {
        Set<String> set = toSet(dict);
        boolean[] dp = new boolean[input.length() + 1];
        dp[0] = true;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && set.contains(input.substring(j, i))) { //为什么是substring(j, i)
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[dp.length - 1];
    }
    private Set<String> toSet (String[] dict) {
        Set<String> set = new HashSet<>();
        for (String s : dict) {
            set.add(s);
        }
        return set;
    }
}

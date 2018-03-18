import java.util.List;
import java.util.ArrayList;

public class Subset {
    public List<String> subSets(String set) {
        List<String> strings = new ArrayList<>();
        if (set == null ) {
            return strings;
        }
        StringBuilder sb = new StringBuilder();
        subset(set, 0, sb, strings);
        return strings;
    }
    private void subset(String set, int index, StringBuilder sb, List<String> result) {
        if (index == set.length()) {
            result.add(sb.toString());
            return;
        }
        sb.append(set.charAt(index));
        subset(set, index + 1, sb, result);
        sb.deleteCharAt(sb.length() - 1);
        subset(set, index + 1, sb, result);
    }
}

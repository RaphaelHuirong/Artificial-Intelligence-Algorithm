import java.util.List;
import java.util.ArrayList;
public class Nqueens {
    public List<List<Integer>> nqueens(int n) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<Integer>();
        helper(cur, result, n);
        return result;
    }
    private void helper(List<Integer> cur, List<List<Integer>> result, int n) {
        if (cur.size() == n) {
            result.add(new ArrayList<>(cur));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isValid(cur, i)) {
                cur.add(i);
                helper(cur, result, n);
                cur.remove(cur.size() - 1);
            }
        }
    }
    private boolean isValid(List<Integer> cur, int i) {
        int row = cur.size();
        int col = i;
        for (int j = 0; j < row; j++) {
            if (cur.get(j) == col || row - j == Math.abs(col - cur.get(j))) {
                return false;
            }
        }
        return true;
    }
}
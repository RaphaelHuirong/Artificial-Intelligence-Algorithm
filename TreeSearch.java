import java.util.Deque;
import java.util.LinkedList;

public class TreeSearch {
    public TreeNode search(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.pollFirst();
            if (cur.key != key) {
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            } else {
                return cur;
            }
        }
        return null;
    }
}



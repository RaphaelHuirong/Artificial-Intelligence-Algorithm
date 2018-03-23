import java.util.Deque;
import java.util.LinkedList;

public class TreeSearch {
    public TreeNode search(TreeNode root, int key) {
        ## corner case
        if (root == null) {
            return null;
        }
        
        ## initialize the frontier using the initial state of problem
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        ## loop do
        while (!queue.isEmpty()) {
            
            ## choose a leaf node and remove it from the frontier
            TreeNode cur = queue.pollFirst();
            
            ## if the node contains a goal state then return the corresponding solution
            if (cur.key == key) {
                return cur;
            } else {
                
                ## expand the chosen node, adding the resulting nodes to the frontier
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
                return cur;
            }
        }
        
        ## if the frontier is empty then return failure
        return null;
    }
}



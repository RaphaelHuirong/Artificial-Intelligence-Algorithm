import java.util.PriorityQueue;
import java.util.Comparator;
public class BestFirstSearch {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Cell> minHeap = new PriorityQueue<Cell>(k, new Comparator<Cell>() {
            @Override
            public int compare (Cell o1, Cell o2) {
                if (o1.value == o2.value) {
                    return 0;
                }
                return o1.value < o2.value ? -1 : 1;
            }
        });
        int col = matrix[0].length;
        int row = matrix.length;
        Cell root = new Cell(0, 0, matrix[0][0]);
        minHeap.offer(root);
        boolean[][] flag = new boolean[row][col];
        flag[0][0] = true;
        for (int i = 0; i <= k - 2; i++) {
            Cell cur = minHeap.poll();
            if (cur.row + 1 < row && flag[cur.row + 1][cur.col] == false) {
                Cell x1 = new Cell(cur.row + 1, cur.col, matrix[cur.row + 1][cur.col]);
                minHeap.offer(x1);
                flag[cur.row + 1][cur.col] = true;

            }
            if (cur.col + 1 < col && flag[cur.row][cur.col + 1] == false) {
                Cell x2 = new Cell(cur.row, cur.col + 1, matrix[cur.row][cur.col + 1]);
                minHeap.offer(x2);
                flag[cur.row][cur.col + 1] = true;
            }
        }
        return minHeap.peek().value;
    }
    public class Cell {
        int row;
        int col;
        int value;
        public Cell(int rowV, int colV, int valueV) {
            this.row = rowV;
            this.col = colV;
            this.value = valueV;
        }
    }
}
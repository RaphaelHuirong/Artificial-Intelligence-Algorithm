import java.util.PriorityQueue;
import java.util.Comparator;

public class MedianTracker {
    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;
    public MedianTracker() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(11, new Comparator<Integer>() {
            @Override
            public int compare (Integer o1, Integer o2) {
                if (o1.equals(o2)) {
                    return 0;
                } else {
                    return o1 > o2 ? -1 : 1;
                }
            }
        });
    }

    public void read(int value) {
        if (maxHeap.isEmpty() || value < maxHeap.peek()) {
            maxHeap.offer(value);
        } else {
            minHeap.offer(value);
        }
        if (maxHeap.size() - minHeap.size() > 1) {
            minHeap.offer(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public Double median() {
        int size = maxHeap.size() + minHeap.size();
        if (size == 0) {
            return null;
        }
        if (size % 2 == 0) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else {
            return (double) maxHeap.peek();
        }
    }
}

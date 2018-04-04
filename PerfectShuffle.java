public class PerfectShuffle {
    public void shuffle(int[] array) {
        if (array.length <= 1) {
            return;
        }
        for (int i = array.length; i > 0; i--) {
            int num = (int)(Math.random() * i);
            swap(array, i - 1, num);
        }
    }
    private void swap (int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}

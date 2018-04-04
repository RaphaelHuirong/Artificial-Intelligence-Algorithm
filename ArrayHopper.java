public class ArrayHopper {
    public boolean canJump(int[] array) {
        boolean[] helper = new boolean[array.length];
        helper[0] = true;
        for (int i = 1; i < helper.length; i++) {
            for (int j = 0; j < i; j++) {
                if (helper[j] && i - j <= array[j]) {
                    helper[i] = true;
                }
            }
        }
        return helper[array.length - 1];
    }
}

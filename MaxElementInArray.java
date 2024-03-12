public class MaxElementInArray {
    public static void main(String[] args) {
        int[] array = { 5, 2, 8, 3, 7, 2, 8, 3, 5, 8, 6 };
        int max = findMaxElement(array);
        System.out.println("Maximum element in the array: " + max);
    }

    public static int findMaxElement(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
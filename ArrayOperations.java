public class ArrayOperations {
    public static void main(String[] args) {
        int[] array = { 5, 2, 8, 3, 7, 2, 8, 3, 5, 8, 6 };
        sortArray(array);
        System.out.print("Sorted Array: ");
        printArray(array);
        int numberToFind = 8;
        int occurrences = countOccurrences(array, numberToFind);
        System.out.println("Number of occurrences of " + numberToFind + ": " + occurrences);
    }

    public static void sortArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Method to print an array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to count occurrences of a number in an array
    public static int countOccurrences(int[] array, int number) {
        int count = 0;
        for (int num : array) {
            if (num == number) {
                count++;
            }
        }
        return count;
    }
}
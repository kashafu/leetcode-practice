public class RecursiveBinarySearch {

    public static int binarySearch(int[] array, int target, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Target found at index mid
            } else if (array[mid] < target) {
                return binarySearch(array, target, mid + 1, right); // Search in the right half
            } else {
                return binarySearch(array, target, left, mid - 1); // Search in the left half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 10, 18, 20};
        int target = 10;

        int result = binarySearch(array, target, 0, array.length - 1);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}

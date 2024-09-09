public class RotateArray {

    public static int[] search(int[] nums, int k) {

        int n = nums.length;
        k = k % n;  // Normalize k to avoid unnecessary rotations

        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the remaining n - k elements
        reverse(nums, k, n - 1);

        return nums;
    }

    // Helper method to reverse a portion of the array
    private  static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}

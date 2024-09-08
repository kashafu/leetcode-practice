public class Application {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        int[] array = {20, 4, 12, 18, 10, 2};

        // Sort the array using the BST
        int[] sortedArray = bst.search(array);

        // Print the sorted array (inorder traversal result)
        printArray(sortedArray, "Binary Search Tree (Sorted Order):");
        // Search for a specific key in the BST
        int key = 18;
        if (bst.searchKey(key)) {
            System.out.println("Key " + key + " found in the Binary Search Tree.");
        } else {
            System.out.println("Key " + key + " not found in the Binary Search Tree.");
        }
    }


    public static void printArray(int[] array, String description) {
        System.out.println(description);
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

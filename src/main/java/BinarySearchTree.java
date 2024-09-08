public class BinarySearchTree {

    Node root;

    // Method to process the input array and return a sorted array using inorder traversal
    public int[] search(int[] array) {
        // Insert all elements from the array into the BST
        for (int num : array) {
            insert(num);
        }

        // Prepare an array to store the inorder traversal (sorted elements)
        int[] result = new int[array.length];
        int[] index = {0};  // Index to keep track of insertion position in result array
        inorder(root, result, index);

        return result;
    }

    // Constructor to initialize the tree
    public BinarySearchTree() {
        root = null;
    }

    // Insert a new value into the BST
    void insert(int data) {
        root = insertRec(root, data);
    }

    // Recursive function to insert a new value
    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    // Inorder traversal that collects elements in an array
    void inorder(Node root, int[] result, int[] index) {
        if (root != null) {
            inorder(root.left, result, index);
            result[index[0]++] = root.data;  // Store elements in the result array
            inorder(root.right, result, index);
        }
    }

    public boolean searchKey(int key) {
        return searchKeyRec(root, key);
    }

    // Recursive search function
    private boolean searchKeyRec(Node root, int key) {
        if (root == null) {
            return false;  // The key is not found in the tree
        }

        if (root.data == key) {
            return true;  // The key is found
        }

        if (key < root.data) {
            return searchKeyRec(root.left, key);  // Search in the left subtree
        } else {
            return searchKeyRec(root.right, key);  // Search in the right subtree
        }
    }
}

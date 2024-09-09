public class Solution {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] array = {20, 4, 12, 18, 10, 2};
        int[] sortedArray = bst.search(array);
        printArray(sortedArray, "Binary Search Tree (Sorted Order):");
    }

    public static void printArray(int[] array, String description) {
        System.out.println(description);
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    static class BinarySearchTree {

        Node root;

        public int[] search(int[] array) {
            for (int num : array) {
                root = insertRec(root, num);
            }
            int[] result = new int[array.length];
            int[] index = {0};
            inorder(root, result, index);
            return result;
        }

        public BinarySearchTree() {
            root = null;
        }

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

        void inorder(Node root, int[] result, int[] index) {
            if (root != null) {
                inorder(root.left, result, index);
                result[index[0]++] = root.data;
                inorder(root.right, result, index);
            }
        }
    }

    static class Node {

        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }
}

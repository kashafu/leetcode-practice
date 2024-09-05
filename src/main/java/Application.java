public class Application {

    public static void main(String[] args) {

        int[] array =  {20,4,12,18,10,2};

        printArray(new BinarySearchTree().search(array), "Binary Search Tree :");
    }


    public static void printArray(int[] array, String description) {
        System.out.println(description);
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

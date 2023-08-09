public class Application {

    public static void main(String[] args) {

        int[] array =  {20,4,12,18,10,2};

        printArray(new BubbleSort().search(array), "Bubble Sort :");
        printArray(new SelectionSort().search(array), "Selection Sort :");
        printArray(new InsertionSort().search(array), "Insertion Sort :");
    }


    public static void printArray(int[] array, String description) {
        System.out.println(description);
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

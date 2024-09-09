public class Application {

    public static void main(String[] args) {

        int[] array =  {1,2,3,4,5,6,7};
        int key = 10;


        int[] result = RotateArray.search(array, key);

        // Print the rotated array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }


}

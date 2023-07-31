import java.util.List;

public class Application {

    public static void main(String[] args) {

        int[] array =  {2,4,6,8,10,12};
        int key = 10;

        System.out.println("Simple Search:  " + new SimpleSearch().search(array, key));
        System.out.println("Binary Search:  " + new BinarySearch().search(array, key));
    }


}

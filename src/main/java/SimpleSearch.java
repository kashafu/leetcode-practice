import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SimpleSearch {

    public int search(int[] array, int key) {

        for(int i = 0; i < array.length; i++){
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }
}

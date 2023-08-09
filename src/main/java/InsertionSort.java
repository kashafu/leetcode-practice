public class InsertionSort {

    public int[] search(int[] array) {

        for(int i=1; i<array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > current) {
                //Keep swapping
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }


        return array;
    }

}


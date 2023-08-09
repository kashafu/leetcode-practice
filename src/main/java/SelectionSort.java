public class SelectionSort {

    public int[] search(int[] array) {

        for(int i=0; i<array.length-1; i++) {

            int smallest = i;
            for(int j=i+1; j<array.length; j++) {
                if(array[j] < array[smallest]) {
                    smallest = j;
                }
            }
            //swap
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }

        return array;
    }

}


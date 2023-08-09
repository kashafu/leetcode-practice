public class QuickSort {

    public int[] search(int[] array) {

        int n = array.length;
        quicksort(array, 0, n - 1);

        return array;
    }

    public static int partition(int []array,int low,int high)
    {
        int pivot=array[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(array[j]<pivot)
            {
                i++;
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        i++;
        int temp=array[i];
        array[i]=pivot;
        array[high]=temp;
        return i;
    }
    
    public static void quicksort(int[]array,int low,int high)
    {
        if(low<high)
        {
            int pivotIndex = partition(array, low, high);
            quicksort(array, low,pivotIndex-1);
            quicksort(array,pivotIndex+1, high);
        }
    }

}


public class QuickSort {

//    Worst : O(n^2)
//    Average : O(nlogn)
// Worst case occurs when pivot is always the smallest or the largest element.

    public int[] search(int[] array) {

        int n = array.length;
        quicksort(array, 0, n - 1);

        return array;
    }

    public static int partition(int []array,int low,int high)
    {
        int pivot=array[high]; // taking last element as pivot
        int i=low-1; // i function is to find out how much smaller elements than pivot

        for(int j=low; j<high; j++)
        {
            if(array[j] < pivot) // element which has less than pivot
            {
                i++;
                //Swap
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }

        //Swap with pivot
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
            quicksort(array, low,pivotIndex-1); // low sorted means left
            quicksort(array,pivotIndex+1, high); // high sorted means right
        }
    }

}


public class MergeSort {

    public int[] search(int[] array) {

        int n = array.length;
        divide(array, 0, n - 1);

        return array;
    }

    //Ologn
    public void divide(int[] array, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(array, si, mid);
        divide(array, mid + 1, ei);
        conquer(array, si, mid, ei);
    }

  // n
    public void conquer(int[] array, int si, int mid, int ei) {
        int[] merged = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= ei) {
            if (array[idx1] <= array[idx2]) {

                merged[x++] = array[idx1++];
            } else {
                merged[x++] = array[idx2++];
            }
        }
        while (idx1 <= mid) {
            merged[x++] = array[idx1++];
        }
        while (idx2 <= ei) {
            merged[x++] = array[idx2++];
        }
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            array[j] = merged[i];
        }
    }

}


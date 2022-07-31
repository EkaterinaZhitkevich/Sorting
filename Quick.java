package Sort;

import java.util.Arrays;

public class Quick {
    int n;
    int[] ints = new int[n];

    public Quick(int n, int[] ints) {
        this.n = n;
        this.ints = ints;
    }

    public void quickSort(int[] ints, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = ints[(leftMarker+rightMarker)/2];
        do{
            while (ints[leftMarker] < pivot){
                leftMarker++;
            }
            while (ints[rightMarker] > pivot){
                rightMarker--;
            }
            if (leftMarker <= rightMarker){
                if (leftMarker < rightMarker){
                    int tmp = ints[leftMarker];
                    ints[leftMarker] = ints[rightMarker];
                    ints[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder){
            quickSort(ints, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker){
            quickSort(ints, leftBorder, rightMarker);
        }
    }


}

package Sort;

import java.util.Arrays;

public class Merge {
    int n;
    int[] ints = new int[n];

    public Merge(int n, int[] ints) {
        this.n = n;
        this.ints = ints;
    }

    public int[] mergeSort(int[] ints){
        if (ints.length == 1){
            return ints;
        } else {
            int n = ints.length / 2;
            int[] left = Arrays.copyOf(ints, n);
            int[] right = Arrays.copyOfRange(ints, n , ints.length);
            left = mergeSort(left);
            right = mergeSort(right);
            return merge(left, right);
        }
    }
    public int[] merge(int[] a, int[] b){
      int[] c = new int[a.length+ b.length];
      int ia = 0;
      int ib = 0;
      int ic = 0;

      while (ia < a.length || ib < b.length){
          if (ia  == a.length){
              c[ic] = b[ib];
              ib++;
          }else if (ib == b.length){
              c[ic] = a[ia];
              ia++;
          }else {
              if (a[ia] <= b[ib]){
                  c[ic] =a[ia];
                  ia++;
              } else {
                  c[ic] = b[ib];
                  ib++;
              }
          }
          ic++;
      }
      return c;
    }
}

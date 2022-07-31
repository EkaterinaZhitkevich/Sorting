package Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ints = new int[5];
        fillArray(ints);
        System.out.println(Arrays.toString(ints));
        Bubble bubble = new Bubble(ints.length, ints);
//        bubble.bubbleSort(ints);
//        System.out.println(Arrays.toString(ints));
//        Merge merge = new Merge(ints.length, ints);
//        ints = merge.mergeSort(ints);
//        System.out.println(Arrays.toString(ints));

        Quick quick = new Quick(ints.length, ints);
        quick.quickSort(ints,0, ints.length-1);
        System.out.println(Arrays.toString(ints));
    }

    public static void fillArray(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) (Math.random() * 20);
        }
    }
}

package Sort;

public class Bubble {
    int n;
    int[] ints = new int[n];

    public Bubble(int n, int[] ints) {
        this.n = n;
        this.ints = ints;
    }

    public void bubbleSort(int[] ints) {
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = 0; j < ints.length - i - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    swap(j, j+1);
                }
            }
        }
    }

    public void swap(int first, int second) {
        int temp = ints[first];
        ints[first] = ints[second];
        ints[second] = temp;
    }
}

package designalg1;

public class InsertionSort implements SortInterface {

    public static void printNumbers(int[] input) {

        for (int anInput : input) {
            System.out.print(anInput + ", ");
        }
        System.out.println("\n");
    }

    public static void insertionSort(int unsorted[]) {

        for (int j = 1; j < unsorted.length; j++) {

            int i = j-1;
            while ( (i > -1) && ( unsorted [i] > unsorted[j] ) ) {
                unsorted [i+1] = unsorted [i];
                i--;
            }
            unsorted[i+1] = unsorted[j];
            printNumbers(unsorted);
        }
    }
}

import java.util.Arrays;

/**
 * This class contains a methods for performing a proper insertion sort
 * a method to benchmark the speed of sorting between the insertion sort
 * and the speed of Arrays.sort()
 * @author ThankGod Chiagozie

 */
public class Benchmark {

    public static void main(String [] args) {
        checker();
    }


    public static void checker(){
        final int arraySize = 100000; // array size constant
        int[] firstList = new int[arraySize];
        // Populate first list array with max integer values
        for(int i = 0; i < arraySize; i++){
            firstList[i] = (int)(Integer.MAX_VALUE * Math.random());
        }

        int[] secondList = firstList; // make second array equal to the first
        long startTime = System.currentTimeMillis(); // start timer
        insertionSort(secondList);
        long runTime = System.currentTimeMillis() - startTime; // calculate runtime

        /**
         *
         * Insertion Sort benchmarks in seconds for different array sizes
         *  1000 = 0.007s
         *  10000 = 0.024s
         *  100000 = 0.791s
         */
        System.out.println(runTime/1000.0);

        long startTimeSecondList = System.currentTimeMillis(); /// start timer second array
        Arrays.sort(firstList);
        long runTimeSecondList = System.currentTimeMillis() - startTimeSecondList; // calculate runtime for second array
        /**
         *
         * Arrays.sort() benchmarks in seconds for different array sizes
         *  1000 = 0.0s
         *  10000 = 0.001s
         *  100000 = 0.003s
         */
        System.out.println(runTimeSecondList/1000.0);
    }



    static void insertionSort(int[] A) {
        // Sort the array A into increasing order.
        int itemsSorted; // Number of items that have been sorted so far.
        for (itemsSorted = 1; itemsSorted < A.length; itemsSorted++) {
            // Assume that items A[0], A[1], ... A[itemsSorted-1]
            // have already been sorted.  Insert A[itemsSorted]
            // into the sorted part of the list.
            int temp = A[itemsSorted];  // The item to be inserted.
            int loc = itemsSorted - 1;  // Start at end of list.
            while (loc >= 0 && A[loc] > temp) {
                A[loc + 1] = A[loc]; // Bump item from A[loc] up to loc+1.
                loc = loc - 1;       // Go on to next location.
            }
            A[loc + 1] = temp; // Put temp in last vacated space.
        }
    }

}

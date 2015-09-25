import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args){
        int[] array = {10, 34, 5, 1, 17};

        System.out.println("unsorted array -> " + Arrays.toString(array));
        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    public static int[] bubbleSort(int[] intArray){
        int j = 0;

        //temp variable to be used during swaps.
        int temp;

        //this should be set to true for first pass.
        boolean swapped = true;
        while(swapped){
            swapped = false;//reset to false for possible consequent swaps.
            j++;

            for(int i = 0; i < intArray.length - j; i++){
                // > is for ascending sort. change to < (or add condition) for descending sort.
                if(intArray[i] > intArray[i + 1]){
                    temp = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = temp;
                    swapped = true;
                }
            }
        }
        return intArray;
    }
}
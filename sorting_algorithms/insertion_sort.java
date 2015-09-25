import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args){
        int[] array = {10, 34, 5, 1, 17};

        System.out.println("unsorted array -> " + Arrays.toString(array));
        System.out.println(Arrays.toString(insertionSort(array)));
    }

    private static int[] insertionSort(int[] inputArray){
        //start from the left-most or initial number in the array
        for(int i = 0; i < inputArray.length; i++){
            int currentValue = inputArray[i]; //the number we want to insert in the correct position
            int index = i; //the index of the number we'll be comparing against

            //while the number we're comparing against is greater than the current
            // value we're looking to insert...
            while(index > 0 && inputArray[index - 1] > currentValue){
                //shift that number to the right and decrement the index so
                //that we check the next number to the left.
                inputArray[index] = inputArray[index - 1];
                index--;
            }

            //we use the index of the last number greater than the current value
            //(which we've pushed to a higher index) to store the current value.
            inputArray[index] = currentValue;
        }
        return inputArray;
    }
}
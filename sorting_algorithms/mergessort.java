import java.util.Arrays;

public class mergessort {
    public static void main(String[] args){
        int[] array = {10, 34, 5, 1, 17};

        System.out.println("unsorted array -> " + Arrays.toString(array));
        System.out.println(Arrays.toString(mergeSort(array)));

    }

    /**
     * a divide-and-conquer sorting algorithm which splits an array to its constituent elements
     * and recombines them in ascending order..
     * @param inputArray: the array to be sorted.
     * @return returns the input array sorted in ascending order.
     */
    public static int[] mergeSort(int[] inputArray){
        int arrayLength = inputArray.length;

        if(arrayLength > 1){ //split and merge if more than one element present.
            //sub-array one will have less elements if arrayLength is odd because of integer division.
            int arrayOneLength = arrayLength / 2;
            //sub-array two will be the length of the rest of the elements.
            int arrayTwoLength = arrayLength - arrayOneLength;

            //initialise the two sub-arrays to be used.
            int[] array1 = new int[arrayOneLength];
            int[] array2 = new int[arrayTwoLength];

            //fill sub-array one.
            for(int i = 0; i < arrayOneLength; i++){
                array1[i] = inputArray[i];
            }

            //fill sub-array two with the remaining elements.
            for(int i = arrayOneLength; i < arrayLength; i++){
                array2[i - arrayOneLength] = inputArray[i];
            }

            //recursively call mergeSort on the sub-arrays.
            //this implements the "divide" part of the divide-and-conquer.
            array1 = mergeSort(array1);
            array2 = mergeSort(array2);

            //i stores the index of the main array. it will be used to let us know where to place
            //the smallest element from the 2 sub-arrays.
            //j stores the index of which element in array1 is currently being compared.
            //k stores the index of which element in array2 is currently being compared.
            int i=0, j=0, k=0;

            //loop until one of the sub-arrays is empty
            while(array1.length != j && array2.length != k){
                //if the current element in array1 is less than the current element in array2.
                if (array1[j] < array2[k]){
                    //array1 currently contains the smaller element--put it in the main array.
                    inputArray[i] = array1[j];
                    //increase the index of the main array so as not to replace it in the next iteration.
                    i++;
                    //increase the index of array1 so that we'll compare the next number in the next iteration.
                    j++;
                }
                //if the current element in array2 is less than the current element in array1
                else{ //array2 currently contains the smaller element--put it in the main array.
                    inputArray[i] = array2[k];
                    i++;
                    //increase the index of array2 so that we'll compare the next number in the next iteration.
                    k++;
                }
            }

            //now, one of the sub-arrays has been exhausted and it has no more elements to compare.
            //this means that all the elements in the remaining sub-array are the highest (and sorted).
            //therefore, it's safe to copy them all into the main array.
            while(array1.length != j){
                inputArray[i] = array1[j];
                i++;
                j++;
            }

            while(array2.length != k){
                inputArray[i] = array2[k];
                i++;
                k++;
            }
        }
        return inputArray;
    }
}
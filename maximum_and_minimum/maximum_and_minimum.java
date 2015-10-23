// Using java solve the problem below:
// Given an array of integers, find the maximum and minimum of this array.

public class MaxMin {

    public static void main (String[] args){
        maxMin(new int[]{65, 3, 14, 1, 17});
    }

    private static void maxMin(int[] intArray) {
        int max = intArray[0];
        int min = intArray[0];

        for(int i : intArray){
            if (i > max){
                max = i;
            }
            else if (i < min) {
                min = i;
            }
        }

        System.out.println("maximum is " + max + "\n" +
                           "minimum is " + min);
    }
}

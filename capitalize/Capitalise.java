// Using java, have the function capitalize(str) take the str parameter being passed and capitalize 
// the first letter of each word. Words will be separated by only one space. 
// the scanner object should be in the main method, from where we are going to call our function for testing
// it should take string input from a user

import java.util.Scanner;

public class Capitalise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide some text: ");
        String text = scanner.nextLine();
        scanner.close();

        System.out.println(capitalize(text));
    }

    private static String capitalize(String str){
        String[] word_array = str.trim().split("\\s+");

        for(int i = 0; i < word_array.length; i++){
            word_array[i] = (Character.toUpperCase(word_array[i].charAt(0))) + word_array[i].substring(1);
        }

        return String.join(" ", word_array);
    }
}
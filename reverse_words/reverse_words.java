// Using JAVA, answer the question below:
// Reverse the words in a given sentence.
// Words are always delimited by spaces. 
// For example if the given word is "reverse words of a sentence".
// The output will be "sentence a of words reverse"

import java.util.StringJoiner;

public class ReverseWords {
    public static void main (String[] args){
        reverseWords("reverse words of a sentence");
    }

    private static void reverseWords(String text){
        String[] string_array = text.split(" ");
        StringJoiner reversed_text = new StringJoiner(" ");

        for (int i = string_array.length - 1; i >= 0; i--){
            reversed_text.add(string_array[i]);
        }

        System.out.println(reversed_text.toString());
    }
}

//  Using java, have the function LongestWord(sen) take the sen parameter
//  being passed and return the largest word in the string. If there are two or more 
//  words that are the same length, return the first word from the string with that length. Ignore punctuation and assume sen will not be empty. 


import java.util.*; 
import java.io.*;

class Function {  
  String LongestWord(String sen) { 
		String[] text = sen.trim().split("\\s+");
		sen = "";
		
		for (String str : text){
			if (str.length() > sen.length()){
				sen = str;
			}
		}			
		return sen;
  } 
  
  public static void main (String[] args) {  
		System.out.println(LongestWord("some words here")); 
  }   
  
}

package com.linear_search;
import java.util.*;
public class SearchSpecificWord {
    public static String findSpecificWord(String[] array,String word){
        //iterating through the array
        for(String sentence:array){
            if(sentence.toLowerCase().contains(word.toLowerCase())){
                return sentence;
            }
        }


        //if word not found
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] array={"I am Prachiti","Hello everyone","I am great!"};
        String word="Hello";
        System.out.println("The sentence that contains the word is: "+findSpecificWord(array,word));
    }

}

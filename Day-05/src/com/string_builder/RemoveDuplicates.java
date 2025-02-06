package com.string_builder;
import java.util.*;
public class RemoveDuplicates {
     public static String removeDuplicates(String st){
         //creating StringBuilder object
         StringBuilder sb= new StringBuilder();

         //creating HashSet
         HashSet<Character> set= new HashSet<>();

         //iterating in the string
         for(int i=0; i<st.length(); i++){
             if(!set.contains(st.charAt(i))){
                  sb.append(st.charAt(i));
                  set.add(st.charAt(i));
             }
         }
         //returning string
         return sb.toString();
     }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a string:" );
        String st= input.nextLine();
        System.out.println("The string after removing duplicates is: "+removeDuplicates(st));

        input.close();
    }
}

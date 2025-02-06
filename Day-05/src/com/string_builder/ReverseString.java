package com.string_builder;

import java.util.*;
public class ReverseString{
    public static void reverse(String st ) {
        //create a StringBuilder object and append the string
        StringBuilder sb = new StringBuilder(st);

        //reverse method to reverse the string
        sb.reverse();

        //print the reversed string
        System.out.println("The reversed string is: "+sb.toString());
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String st = input.nextLine();

        //calling reverse() function to display the result
        reverse(st);

        input.close();
    }

}
package com.string_buffer;
import java.util.*;

public class Concatenate {
    public static String concatenate(String array[]){
        //creating StringBuffer object
        StringBuffer sb=new StringBuffer();

        //declaring String array


        //iterating through the array of strings
        for(int i=0;i<array.length;i++){
            sb.append(array[i]);
        }
       //returning concatenated string
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter string elements: ");
        String array[]=new String[5];
        for(int i=0;i<5;i++){
            array[i]=input.next();

        }
        System.out.println("Concatenated string is: "+concatenate(array));

        input.close();
    }
}

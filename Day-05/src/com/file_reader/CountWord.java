package com.file_reader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;



    public class CountWord {
        public static void main(String[] args) {
            /*if(args.length<2){
                System.out.println("Usage: java wordcounter <sample.txt><is>");
                return;
            }*/
            String filename="sample.txt";
            String target="is";
            int count=0;
            try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {
                String line;

                while ((line = br.readLine()) != null) {
                    // Read line by line
                    String[] words=line.split("\\W+");
                    for(String word:words){
                        if(word.equalsIgnoreCase(target)){
                            count++;
                        }
                    }
                }

            }

                 catch (IOException e) {
                     System.out.println("Error reading file: "+e.getMessage());
                     return;
            }
            System.out.println("The word '"+ target+"' appears "+count+" times in the file");


        }
        }

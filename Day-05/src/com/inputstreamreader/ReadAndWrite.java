package com.inputstreamreader;
import java.io.*;
public class ReadAndWrite {



        public static void main(String[] args) {
            String filename = "output.txt"; // Output file name

            // Try-with-resources to automatically close streams
            try (InputStreamReader inputStreamReader = new InputStreamReader(System.in);
                 BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                 FileWriter fileWriter = new FileWriter(filename, true); // Append mode
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

                System.out.println("Enter text (type 'exit' to stop):");

                String inputLine;
                while (true) {
                    inputLine = bufferedReader.readLine(); // Read user input

                    if ("exit".equalsIgnoreCase(inputLine)) {
                        System.out.println("Input stopped. Data saved to " + filename);
                        break; // Exit the loop when "exit" is entered
                    }

                    bufferedWriter.write(inputLine); // Write input to file
                    bufferedWriter.newLine(); // Move to the next line
                    bufferedWriter.flush(); // Ensure data is written immediately
                }

            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }



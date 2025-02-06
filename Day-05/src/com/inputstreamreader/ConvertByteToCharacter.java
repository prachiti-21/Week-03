package com.inputstreamreader;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.*;

public class  ConvertByteToCharacter {
    public static void main(String[] args) {
        String filename = "sample.txt"; // Specify the file to read
        String charset = "UTF-8"; // Encoding of the file

        // Try-with-resources to automatically close resources
        try (FileInputStream fileInputStream = new FileInputStream("sample.txt");
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, charset);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // Print the read characters
            }

        } catch (UnsupportedEncodingException e) {
            System.out.println("Unsupported encoding: " + charset);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

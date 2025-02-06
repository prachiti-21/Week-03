package com.inputstreamreader;

import java.io.*;
import java.util.concurrent.TimeUnit;
import static java.lang.System.*;

public class FileReaderVsInputStreamReader {
    public static void main(String[] args) {
        String filePath = "sample.txt"; // Update with the actual file path

        out.println("Using FileReader:");
        long timeFileReader = countWordsWithFileReader(filePath);

        out.println("Using InputStreamReader:");
        long timeInputStreamReader = countWordsWithInputStreamReader(filePath);

        out.println("Comparison:");
        out.println("Time taken with FileReader: " + timeFileReader + " ms");
        out.println("Time taken with InputStreamReader: " + timeInputStreamReader + " ms");
    }

    public static long countWordsWithFileReader(String filePath) {
        long startTime = System.nanoTime();
        int wordCount = 0;

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        out.println("Word Count (FileReader): " + wordCount);
        return TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
    }

    public static long countWordsWithInputStreamReader(String filePath) {
        long startTime = System.nanoTime();
        int wordCount = 0;

        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath), "UTF-8");
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        out.println("Word Count (InputStreamReader): " + wordCount);
        return TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
    }
}


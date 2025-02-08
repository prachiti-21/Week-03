package com.bigo;
import java.io.*;
public class CompareReading {
    private static final String[] FILE_PATHS = {
            "file_1MB.txt",    // 1MB file
            "file_100MB.txt",  // 100MB file
            "file_500MB.txt"   // 500MB file
    };

    private static final int BUFFER_SIZE = 8192; // 8KB buffer

    public static void main(String[] args) {
        System.out.println("Comparing FileReader and InputStreamReader for different file sizes...\n");
        System.out.printf("%-10s %-20s %-20s%n", "File Size", "FileReader Time (ms)", "InputStreamReader Time (ms)");
        System.out.println("-------------------------------------------------------------");

        for (String filePath : FILE_PATHS) {
            long fileSizeMB = getFileSizeMB(filePath);
            long fileReaderTime = measureFileReader(filePath);
            long inputStreamReaderTime = measureInputStreamReader(filePath);

            System.out.printf("%-10s %-20d %-20d%n", fileSizeMB + "MB", fileReaderTime, inputStreamReaderTime);
        }
    }

    private static long measureFileReader(String filePath) {
        long startTime = System.currentTimeMillis();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath), BUFFER_SIZE)) {
            while (reader.read() != -1) {
            } // Read character by character
        } catch (IOException e) {
            e.printStackTrace();
        }
        return System.currentTimeMillis() - startTime;
    }

    private static long measureInputStreamReader(String filePath) {
        long startTime = System.currentTimeMillis();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)), BUFFER_SIZE)) {
            while (reader.read() != -1) {
            } // Read character by character
        } catch (IOException e) {
            e.printStackTrace();
        }
        return System.currentTimeMillis() - startTime;
    }

    private static long getFileSizeMB(String filePath) {
        File file = new File(filePath);
        return file.length() / (1024 * 1024); // Convert bytes to MB


    }
}



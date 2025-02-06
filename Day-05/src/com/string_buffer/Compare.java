package com.string_buffer;
import java.util.*;
public class Compare {
    public static void compareTime(){
        final int iterations = 1_000_000;
        String text = "hello";

        // Measure time for StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }
        long endTime = System.nanoTime();
        long stringBufferTime = endTime - startTime;

        // Measure time for StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }
        endTime = System.nanoTime();
        long stringBuilderTime = endTime - startTime;

                // Print results
                System.out.println("Time taken by StringBuffer: " + stringBufferTime + " ns");
                System.out.println("Time taken by StringBuilder: " + stringBuilderTime + " ns");
            }

    public static void main(String[] args) {
       compareTime();

    }
        }




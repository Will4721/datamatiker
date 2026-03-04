package filereader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class StoryFileReader {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String hi = sc.nextLine();
            long startTime = System.nanoTime();  // Start CPU tid

        try {

            BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter("src\\filereader\\fairytaleOutput.txt"));
            for(int i = 1; i <= 10; i++) {

                bufferedwriter.write(hi);
                bufferedwriter.newLine();
            }
            bufferedwriter.close();

        } catch (IOException e) {
            e.printStackTrace();  // Printer fejlen
        }

            long endTime = System.nanoTime();  // Slut CPU tid
            long duration = endTime - startTime;

            System.out.println("CPU tid (nanosekunder): " + duration);
        }

    }


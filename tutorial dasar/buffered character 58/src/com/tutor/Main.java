package com.tutor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws Exception {
        //membaca file
        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferReader = new BufferedReader(fileInput);
        bufferReader.mark(200);

        //membaca kedalam string
        String data = bufferReader.readLine();
        System.out.println(data);

        //membaca ke dalam char
        bufferReader.reset();
        char dataChar[] = new char[25];
        bufferReader.read(dataChar, 0, 25);
        System.out.println(Arrays.toString(dataChar));

        //membaca baris
        bufferReader.reset();
        System.out.println(bufferReader.readLine());
        System.out.println(bufferReader.readLine());

        //menulis file
        FileWriter fileOutput = new FileWriter("output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileOutput);

        bufferReader.reset();
        String baris1 = bufferReader.readLine();
        String baris2 = bufferReader.readLine();

        bufferedWriter.write(baris1, 0, baris1.length());
        bufferedWriter.flush();

        //bisa menambah new line
        bufferedWriter.newLine();

        bufferedWriter.write(baris2, 0, baris2.length());
        bufferedWriter.flush();

        bufferReader.close();
        bufferedWriter.close();
        fileInput.close();
        fileOutput.close();

    }
}
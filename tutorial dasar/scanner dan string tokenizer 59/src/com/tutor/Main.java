package com.tutor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Main
 */
public class Main {

    public static void main(String[] args)  throws Exception{
        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);

        Scanner scanner = new Scanner(bufferedReader);
        //membaca kata, dengan pemisah / delimeter
        System.out.println(scanner.hasNext()); // true
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.hasNext()); // false

        FileReader fileInput2 = new FileReader("input2.txt");
        bufferedReader = new BufferedReader(fileInput2);
        bufferedReader.mark(200);
        scanner = new Scanner(bufferedReader);
        scanner.useDelimiter(",");
        System.out.println(scanner.hasNext());

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        //menggunakan string tokenizer
        bufferedReader.reset();
        String data = bufferedReader.readLine();
        System.out.println(data);

        StringTokenizer stringTokenizer = new StringTokenizer(data, ",");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }

        //baris 2
        data = bufferedReader.readLine();
        System.out.println(data);

        stringTokenizer = new StringTokenizer(data, ",");

        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }

    }
}
package com.tutor;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int arrayData[] = {0,1,2,3};

        Scanner inputUser = new Scanner(System.in);
        FileInputStream file = null;

        System.out.print("Data ke: ");
        int indexInput = inputUser.nextInt();

        System.out.println("Exception manual");
        try {
            System.out.printf("Data array ke-%d, adalah %d\n\n", indexInput, arrayData[indexInput]);
        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.println("Exception fungsi");
        int data = fungsiException(arrayData, indexInput);
        System.out.printf("Data array ke-%d, adalah %d\n\n", indexInput, data);



        System.out.println("Exception throw method");
        int data2 = 0;
        try {
            data2 = fungsiException2(arrayData, indexInput);
        } catch (Exception e) {
            System.err.println(e);
        }
        System.out.printf("Data array ke-%d, adalah %d\n", indexInput, data2);



















        System.out.println("\n\nAkhir dari program");
    }
    public static int fungsiException2(int array[], int index) throws Exception{
        int hasil = array[index];
        return hasil;
    }
    public static int fungsiException(int array[], int index) {
        int hasil = 0;
        try {
            hasil = array[index];
        } catch (Exception e) {
            System.err.println(e);
        }
        return hasil;
    }
}
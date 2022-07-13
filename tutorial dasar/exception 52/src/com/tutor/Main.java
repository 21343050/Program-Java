package com.tutor;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {0,1,2,3};

        Scanner userInput = new Scanner(System.in);
        FileInputStream file =  null;
        System.out.print("Array nilai ke: ");
        int index = userInput.nextInt();
        
        // exception [try, catch, finally]
        System.out.println("Exception Array");
        try {
            System.out.printf("Nilai Array ke-%d, adalah %d\n", index, array[index]);
        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.println("Exception IO");
        try {
            file = new FileInputStream("input.txt");
        } catch (IOException e) {
            System.err.println(e);
        }

        //menggabungkan 2 exception
        System.out.println("Gabungan Exception");
        try {
            System.out.printf("Nilai Array ke-%d, adalah %d\n", index, array[index]);
            file = new FileInputStream("input.txt");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Tak sesuai array");
        } catch (IOException e) {
            System.err.println("Tak de file");
        }

        //finally
        System.out.println("Menambahkan Finally");
        try {
            System.out.printf("Nilai Array ke-%d, adalah %d\n", index, array[index]);
            file = new FileInputStream("input.txt");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Tak sesuai array");
        } catch (IOException e) {
            System.err.println("Tak de file");
        } finally {
            System.err.println("Finally");
        }
        

        System.out.println("Akhir Dari Program");
    }
}
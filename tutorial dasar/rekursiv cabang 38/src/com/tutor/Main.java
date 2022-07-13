package com.tutor;
import java.util.*;
import java.lang.*;

/**
 * InnerMain
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai: ");
        int nilai = input.nextInt();
        int nilai_fibonaci = fibonaci(nilai, "atas");
        System.out.println("Nilai Fibonachi ke: "+ nilai +" adalah: " +nilai_fibonaci);
    }
    private static int fibonaci(int n, String daun) {
        System.out.println("daun "+daun);
        System.out.println("Ini adalah fibonaci ke- "+n);
        System.out.println();
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonaci(n - 1, "kiri") + fibonaci(n - 2, "kanan");
        }
        
    }
}
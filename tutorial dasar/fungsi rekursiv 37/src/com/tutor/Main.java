package com.tutor;
import java.util.*;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        int nilai = input.nextInt();
        System.out.println("Anda Memasukkan nilai: "+nilai);

        printNilai(nilai);
        
        int jumlah = jumlahNilai(nilai);
        System.out.println("Jumlah Nilai: "+jumlah);

        int faktorial = hitungfaktorial(nilai);
        System.out.println("Jumlah Faktorial "+faktorial);
    }

    private static int hitungfaktorial(int parameter) {
        System.out.println("Faktorial "+parameter);

        if (parameter == 1) {
            return parameter;
        }
        return parameter * hitungfaktorial(parameter - 1);
    }
    private static int jumlahNilai(int parameter) {
        System.out.println("Parameter "+ parameter);

        if (parameter == 0) {
            return parameter;
        }
        return parameter + jumlahNilai(parameter - 1);
    }

    private static void printNilai(int parameter) {
    System.out.println("Nilai = "+parameter);
        if (parameter == 0) {
            return;
        }
        parameter--;
        printNilai(parameter);
    }
}
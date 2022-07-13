package com.tutor;

import java.util.*;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner ketikanScanner = new Scanner(System.in);

        System.out.print("Masukkan Panjang: ");
        int inputPanjang = ketikanScanner.nextInt();

        System.out.print("Masukkan Lebar: ");
        int inputLebar = ketikanScanner.nextInt();

        gambar(inputPanjang, inputLebar);
        tampilKelilingDanLuas(inputPanjang, inputLebar);
    }

    private static void tampilKelilingDanLuas(int panjang, int lebar){
        System.out.println("Luas: "+ luas(panjang, lebar));
        System.out.println("Keliling: "+keliling(panjang, lebar));
    }

    private static int luas(int panjang, int lebar) {
        int hasil = (panjang+lebar) * 2;
        return hasil;
    }

    private static int keliling(int panjang, int lebar){
        int hasil = panjang * lebar;
        return hasil;
    }

    private static void gambar(int panjang, int lebar){
        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < lebar; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
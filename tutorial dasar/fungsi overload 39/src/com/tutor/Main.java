package com.tutor;
import java.util.*;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        int hasilInteger;
        float hasilFloat;
        hasilInteger = hasilInt(5, 6);
        printAngka(hasilInteger);
        hasilFloat = hasilFloat(5.8f, 4.9f);
        printAngka(hasilFloat);

        printAngka(5);
        printAngka(4.4f);
        printAngka(4.7d);

    }
    private static float hasilFloat(Float angkaFloat1, Float angkaFloat2) {
        return angkaFloat1 + angkaFloat2;
    }

    private static int hasilInt(int angkaInt1, int angkaInt2) {
        return angkaInt1 + angkaInt2;
    }

    private static void printAngka(int nilaiInt) {
        System.out.println("Ini integer: "+nilaiInt);
    }

    private static void printAngka(Float nilaiFloat) {
        System.out.println("Ini float: "+nilaiFloat);
    }

    private static void printAngka(Double nilaiDouble) {
        System.out.println("Ini double: "+nilaiDouble);
    }
}
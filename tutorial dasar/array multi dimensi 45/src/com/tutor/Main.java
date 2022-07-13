package com.tutor;
import java.util.Arrays;
/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("\nBelajar Array 2 dimensi");

        //buat array 2 dimensi assignment

        int arrayDimensi2[][] = new int [5][4];
        int arrayDimensi[][] = { 
            {1, 2, 3, 4}, 
            {5, 6, 7, 8} 
        };
        printArray2D(arrayDimensi);

        // //buat array 2 dimensi deklarasi
        // printArrayLooping(arrayDimensi2); //dengan fungsi


        // //dengan manual looping
        // for (int i = 0; i < arrayDimensi2.length; i++) {
        //     System.out.print("[ ");
        //     for (int j = 0; j < arrayDimensi2[i].length; j++) {
        //         System.out.print(arrayDimensi2[i][j]+", ");
        //     }
        //     System.out.println("]");
        // }

        
        //dengan foreach
        System.out.println("\n----------Batas Suci--------");
        printArray(arrayDimensi2);

        System.out.println("\n---------Batas Suci---------");

        int arrayDimensi2_2[][] = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15}
        };
        printArray(arrayDimensi2_2);
        System.out.println();
        printArrayLooping(arrayDimensi2_2);
        System.out.println();
        printArray2D(arrayDimensi2_2);


        System.out.println("\n---------Batas Suci---------");
        int array_ragged[][] = {
            {1,2,3},
            {2,3,6,7},
            {1},
        };
        printArray(array_ragged);

    }
    private static void printArrayLooping(int array2D[][]) {
        for (int i = 0; i < array2D.length; i++) {
            System.out.println(Arrays.toString(array2D[i]));
        }
    }

    private static void printArray(int array1D[][]) {
        for (int[] baris : array1D) {
            System.out.print("[ ");
            for (int kolom : baris) {
                System.out.print(kolom+ ", ");
            }
            System.out.println("]\n");
        }    }

    private static void printArray2D(int array2D[][]) {
        System.out.println(Arrays.deepToString(array2D));
    }
}

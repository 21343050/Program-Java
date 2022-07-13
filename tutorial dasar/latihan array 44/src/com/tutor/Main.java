package com.tutor;
import java.util.Arrays;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int arrayAngka1[] = {2,3,7,4,5,8,9,1};
        int arrayAngka2[] = {3,5,2,1,7,6,9,8};

        //penjumlahan 2 buah array
        System.out.println("-----Penjummlahan 2 buah array-----");
        int arrayHasil1[] = tambahArray(arrayAngka1, arrayAngka2);
        printArray(arrayAngka1);
        printArray(arrayAngka2);
        printArray(arrayHasil1);

        
        System.out.println("\n-----Gabung 2 buah array-----");
        int arrayHasil2[] = gabungArray(arrayAngka1, arrayAngka2);
        printArray(arrayAngka1);



    }
    private static void gabungArray(int dataArray1[], int dataArray2[]) {
        int arrayHasil2[] = new int[dataArray1.length + dataArray2.length];
        for (int i = 0; i < dataArray1.length; i++){
            arrayHasil2[i]= dataArray1[i];
        }
    }

    private static void printArray(int dataArray[]) {
        System.out.println("Array: "+Arrays.toString(dataArray));
    }

    private static int[] tambahArray(int dataArray1[], int dataArray2[]) {
        int arrayHasil[] = new int[dataArray1.length];
        for (int i = 0; i < arrayHasil.length; i++) {
            arrayHasil[i] = dataArray1[i] + dataArray2[i];
        }
        return arrayHasil;
    }
}
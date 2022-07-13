package com.tutor;


/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int matrixA[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };

        int matrixB[][] = {
            {11,12,13},
            {14,15,16},
            {17,18,19},
        };
        System.out.println("Penjumlahan Matrix A dan Matrix B");
        printMatrix(matrixA); System.out.println("    +\n"); printMatrix(matrixB);

        int hasilTambah[][] = tambahArray(matrixA, matrixB);
        printMatrix(hasilTambah);

        //perkalian matrix
        int matrixC[][] = {
            {1,2},
            {3,4},
            {5,6},
            {7,8},
        };

        int matrixD[][] = {
            {11,12,15},
            {13,14,12},
        };

        System.out.println("Perkalian Matrix C dan Matrix D");
        printMatrix(matrixC); System.out.println("    x\n"); printMatrix(matrixD);

        int hasilKali[][] = perkalianMatrix(matrixC, matrixD);
        printMatrix(hasilKali);
    }

    private static int[][] perkalianMatrix(int matrix_3[][], int matrix_4[][]) {
        int barisC = matrix_3.length;
        int kolomC = matrix_3[0].length;

        int barisD = matrix_4.length;
        int kolomD = matrix_4[0].length;

        int hasilKali[][] = new int [barisC][kolomD];

        int buffer;
        if (kolomC == barisD) {
            System.out.println("Hasil");
            for (int i = 0; i < barisC; i++) {
                for ( int j = 0; j < kolomD; j++) {
                    buffer = 0;
                    for (int k = 0; k < kolomC; k++) {
                        buffer +=  matrix_3[i][k] * matrix_4[k][j];
                    }
                    hasilKali[i][j] = buffer;
                }
            }
        } else {
            System.out.println("Jumlah Kolom Matrix 1 Tidak Sama Dengan Baris Matrix 2");
        }
        return hasilKali;
    }

    private static int[][] tambahArray(int[][] matrix_1, int[][] matrix_2) {
        int barisA = matrix_1.length;
        int kolomA = matrix_1[0].length;

        int barisB = matrix_2.length;
        int kolomB = matrix_2[0].length;
        int hasil[][] = new int [barisA][kolomA];
        if (barisA == barisB && kolomA == kolomB) {
            System.out.println("Hasil");
            for (int i = 0; i < barisA; i++) {
                for (int j = 0; j < kolomA; j++) {
                    hasil[i][j] = matrix_1[i][j] + matrix_2[i][j];
                }
            }
        } else {
            System.out.println("Jumlah Baris Dan Kolom Tidak Sama");
        }
        return hasil;
    }

    private static void printMatrix(int dataArray[][]) {
        int baris = dataArray.length;
        int kolom = dataArray[0].length;

        for (int i = 0; i < baris; i++) {
            System.out.print("[ ");
            for (int j = 0; j < kolom; j++) {
                System.out.print(dataArray[i][j]);
                if (j < kolom - 1) {
                    System.out.print(", ");
                } else {
                    System.out.print(" ]");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
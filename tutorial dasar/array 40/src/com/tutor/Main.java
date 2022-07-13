package com.tutor;

import java.util.Arrays;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        System.out.println("Assignment Array");
        int[] arrayInteger = {1, 2, 3};

        System.out.println(arrayInteger[0]);      
        System.out.println(arrayInteger[1]);      
        System.out.println(arrayInteger[2]);


        System.out.println("Deklarasi Array");
        float[] arrayFloat = new float[5];

        arrayFloat[2] = 34.7f;
        arrayFloat[0] = 7.7f;

        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);
        System.out.println(arrayFloat[4]);

        System.out.println(Arrays.toString(arrayInteger));
        System.out.println(Arrays.toString(arrayFloat));
    }
}
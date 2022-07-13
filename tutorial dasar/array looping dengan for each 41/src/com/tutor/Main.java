package com.tutor;

import java.util.Arrays;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        int arrayAngka[] = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arrayAngka));

        //looping standart
        System.out.println("-----Looping Standart-----");
        for (int i = 0; i <8; i++) {
            System.out.println("Index ke-"+i+" adalah = "+ arrayAngka[i]);
        }

        //looping dengan properti array
        System.out.println("\n-----Looping Properti Array-----");
        for (int i = 0; i < arrayAngka.length; i++) {
            System.out.println("index ke-"+i+" Adalah = "+arrayAngka[i]);
        }

        //looping khusus array
        System.out.println("\n-----Looping Foreach-----");
        for (int i : arrayAngka) {
            System.out.println("Looping dengan foreach: "+i);
        }
    }
}
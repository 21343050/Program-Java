package com.tutor;
//test mabar
import java.util.Arrays;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int array2d[][] = {
            {1,2,3},
            {4,5,6,}
        };
        System.out.println(array2d);
        System.out.println(Arrays.toString(array2d));
        System.out.println(Arrays.deepToString(array2d));

        char array2d_1[][] = {
            {'h', 'e', 'r', 'i'},
            {'r', 'm', 'd', 'n'},
        };
        System.out.println(array2d_1);
        System.out.println(Arrays.deepToString(array2d_1));
        System.out.println(Arrays.deepEquals(array2d, array2d_1));
        System.out.println(Arrays.deepHashCode(array2d));
    }
}
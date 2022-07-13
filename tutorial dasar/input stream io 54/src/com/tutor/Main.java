package com.tutor;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws Exception {
        // try {
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        FileInputStream file = new FileInputStream("input.txt");
        System.out.print((char)file.read());
        System.out.print((char)file.read());
        System.out.print((char)file.read());
        System.out.println((char)file.read());
    }
}
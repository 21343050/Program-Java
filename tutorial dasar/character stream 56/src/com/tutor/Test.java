package com.tutor;

import java.io.FileReader;
import java.io.FileWriter;
/**
 * Test
 */
public class Test {

    public static void main(String[] args) throws Exception {
        FileReader charInput = new FileReader("go.txt");
        FileWriter charOutput = new FileWriter("gi.txt");

        int buffer = charInput.read();
        while (buffer != -1) {
            System.out.println((char)buffer);
            charOutput.write(buffer);
            buffer = charInput.read();
        }

        charInput.close();
        charOutput.close();
    }
}
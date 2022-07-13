package com.tutor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws Exception {
        //membuka file
        //ByteStream -> FileInputStream
        //CharacterStream -> FileReader

        FileInputStream byteFile = new FileInputStream("input.txt");
        FileReader characterFile = new FileReader("input.txt");

        FileOutputStream byteFileOutput = new FileOutputStream("outputbyte.txt");
        FileWriter characterFileOutput = new FileWriter("outputchar.txt");

        //membaca file
        int buffer = byteFile.read();
        while (buffer != -1) {
            System.out.println((char)buffer);
            byteFileOutput.write(buffer);
            buffer = byteFile.read();
        }

        System.out.println("\n");
        int buffer2 = characterFile.read();
        while (buffer2 != -1) {
            System.out.println((char)buffer2);
            characterFileOutput.write(buffer2);
            buffer2 = characterFile.read();
        }

        //menutup file
        byteFile.close();
        characterFile.close();
        byteFileOutput.close();
        characterFileOutput.close();
    }
}
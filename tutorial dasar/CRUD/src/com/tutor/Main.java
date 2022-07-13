package com.tutor;

import java.io.IOException;
import java.util.Scanner;

import CRUD.Operasi;
import CRUD.Util;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException{
        Scanner terminalInput = new Scanner(System.in);
        String pilihanInput;
        boolean isLanjutkan = true;

        while (isLanjutkan) {
            Util.clearScreen();
            System.out.println("Database Perpustakaan");
            System.out.println("1.\tLihat Seluruh Buku");
            System.out.println("2.\tCari Data Buku");
            System.out.println("3.\tTambah Data Buku");
        System.out.println("4.\tUbah Data Buku");
        System.out.println("5.\tHapus Data Buku");

        System.out.print("Masukkan Pilihan: ");
        pilihanInput = terminalInput.next();
        
        switch (pilihanInput) {
            case "1":
            System.out.println("\n=================");
            System.out.println("List Seluruh Buku");
            System.out.println("=================");
            Operasi.tampilkanData();
            break;

            case "2":
            System.out.println("\n=========");
            System.out.println("Cari Buku");
            System.out.println("=========");
            Operasi.cariData();
            break;

            case "3":
            System.out.println("\n===========");
            System.out.println("Tambah Buku");
            System.out.println("===========");
            Operasi.tambahData();
            Operasi.tampilkanData();
            break;

            case "4":
            System.out.println("\n=========");
            System.out.println("Ubah Buku");
            System.out.println("=========");
            Operasi.updateData();
            break;

            case "5":
            System.out.println("\n==========");
            System.out.println("Hapus Buku");
            System.out.println("==========");
            Operasi.deleteData();
            break;
        
            default:
            System.err.println("\nInput anda tidak ditemukan, silahkan pilih 1-5");
            break;
            }
            isLanjutkan = Util.getYesOrNo("Apakah Anda Ingin Melanjutkan");
        }
    }
}
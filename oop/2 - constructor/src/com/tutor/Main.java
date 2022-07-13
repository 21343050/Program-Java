package com.tutor;

import java.util.Scanner;

// class tanpa constructor
class Polos {
    String dataString;
    int dataInteger;
}

// class dengan constructor
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;

    // // contructor pertama kali dipanggil
    // Mahasiswa() {
    //     System.out.println("Ini adalah constructor");
    // }

    // constructor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan) {
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println("Nama    : "+nama);
        System.out.println("NIM     : "+NIM);
        System.out.println("Jurusan : "+jurusan);
    }
}

class Kali {
    int satu;
    int dua;

    Kali() {
        Scanner Input = new Scanner(System.in);

        System.out.print("Angka 1 :");
        satu = Input.nextInt();
        System.out.print("Angka 2 :");
        dua = Input.nextInt();
        int hasil = satu * dua;
        System.out.println(+satu+ " Dikali " +dua+ " = "+hasil);
    }
}
class Kali2 {
    int satu;
    int dua;

    Kali2(int inputSatu, int inputDua) {
        satu = inputSatu;
        dua = inputDua;

        int hasil = satu * dua;
        System.out.println(+satu+ " Dikali " +dua+ " = "+hasil);
    }
}

public class Main {
    public static void main(String[] args) throws Exception{
        int satu;
        int dua;
        Scanner terminalInput = new Scanner(System.in);


        Mahasiswa mahasiswa1 = new Mahasiswa("Heri Ramadhan", "21343050", "Informatika");
        Kali perkalian1 = new Kali();

        System.out.print("Angka 1 :");
        satu = terminalInput.nextInt();
        System.out.print("Angka 2 :");
        dua = terminalInput.nextInt();
        Kali2 perkalian2 = new Kali2(satu, dua);
        
        // Polos objectPolos = new Polos();

        // objectPolos.dataString = "polos";
        // objectPolos.dataInteger = 0;

        // System.out.println(objectPolos.dataString);
        // System.out.println(objectPolos.dataInteger);
    }
}

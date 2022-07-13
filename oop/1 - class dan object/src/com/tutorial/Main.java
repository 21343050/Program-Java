package com.tutorial;


// membuat class sebagai template
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}


public class Main {
    public static void main(String[] args) throws Exception{
        
        // membuat objek
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Heri Ramadhan";
        mahasiswa1.NIM = "21343050";
        mahasiswa1.jurusan = "Informatika";
        mahasiswa1.IPK = 3.7;
        mahasiswa1.umur = 18;

        System.out.println("Nama    : "+mahasiswa1.nama);
        System.out.println("NIM     : "+mahasiswa1.NIM);
        System.out.println("Jurusan : "+mahasiswa1.jurusan);
        System.out.println("IPK     : "+mahasiswa1.IPK);
        System.out.println("Umur    : "+mahasiswa1.umur);

        System.out.println();

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Heri Ramadhan";
        mahasiswa2.NIM = "21343050";
        mahasiswa2.jurusan = "Informatika";
        mahasiswa2.IPK = 3.7;
        mahasiswa2.umur = 18;

        System.out.println("Nama    : "+mahasiswa2.nama);
        System.out.println("NIM     : "+mahasiswa2.NIM);
        System.out.println("Jurusan : "+mahasiswa2.jurusan);
        System.out.println("IPK     : "+mahasiswa2.IPK);
        System.out.println("Umur    : "+mahasiswa2.umur);
    }
}

package com.tutor;

class Mahasiswa {
    String nama;
    String NIM;

    // constructor
    Mahasiswa(String nama, String NIM) {
        this.nama = nama;
        this.NIM = NIM;
    }

    // method tanpa return dan parameter
    void show() {
        System.out.println("Nama: "+nama);
        System.out.println("NIM : "+NIM);
    }

    // method tanpa return dg parameter
    void setNama(String nama) {
        this.nama = nama;
    }

    // method dengan return tanpa parameter
    String getNama() {
        return this.nama;
    }
    String getNIM() {
        return this.NIM;
    }

    // method dg return dan parameter
    String sayHi(String message) {
        return message + " juga, nama saya adalah " + this.nama;
    }
}

public class Main {

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("NONO", "376521");
        mahasiswa1.show();
        mahasiswa1.setNama("Heri Ramadhan");
        mahasiswa1.show();
        
        System.out.println("\n"+mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("Ganteng");
        System.out.println(data);
    }
}
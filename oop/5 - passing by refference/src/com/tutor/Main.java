package com.tutor;

/**
 * Main
 */

 class Buku {
     String judul;
     String penulis;

     Buku (String judul, String penulis) {
         this.judul = judul;
         this.penulis = penulis;
     }

     void display (){
         System.out.println("\nJudul\t: "+this.judul);
         System.out.println("Penulis\t: "+this.penulis);
     }
 }


public class Main {

    public static void main(String[] args) {
        

        Buku dataBuku1 = new Buku("Laskar", "Heri Ramadhan");
        dataBuku1.display();
        fungsi(dataBuku1);

        Buku dataBuku2 = new Buku("Pemuda Pancasila", "A.H Nasution");
        dataBuku2.display();
        fungsi(dataBuku2); // pass reference, jadi mengikut ke variable addresbuku

        dataBuku2.judul = "Pelangi";
        dataBuku1.display();
        dataBuku2.display();

        fungsi(dataBuku2);
        dataBuku1.display();
        dataBuku2.display();
    }

    public static void fungsi(Buku dataBuku) {
        String addresBuku2 = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("Addres Buku \t: "+addresBuku2);
        dataBuku.penulis = "Heri Komeyaro";
    }
}